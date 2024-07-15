import shutil
import zipfile
import pandas as pd
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time
import logging
from selenium.webdriver.common.action_chains import ActionChains
import os

# Configure logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(message)s')
logger = logging.getLogger(__name__)

# Constants
#EXCEL_FILE = '5000K EXCEL OF FOLDER.xlsx'
LAST_INDEX_FILE = 'last_index.txt'
OUTPUT_ZIP = 'output.zip'
# Step 1: Read the Excel file
def read_excel(file_path):
    df = pd.read_excel(file_path)  # Read the Excel file
    return df['Application ID'].tolist()  # Return the list of unique numbers

# Set up argument parser
parser = argparse.ArgumentParser(description='Run the Appurti Bot script.')
parser.add_argument('excel_file', type=str, help='Path to the Excel file')
args = parser.parse_args()

EXCEL_FILE = args.excel_file
unique_numbers = read_excel(EXCEL_FILE)  # Example if the file is in the same folder
# Step 1: Read the Excel file
def read_excel(file_path):
    df = pd.read_excel(file_path)  # Read the Excel file
    return df['Application ID'].tolist()  # Return the list of unique numbers

unique_numbers = read_excel(EXCEL_FILE)  # Example if the file is in the same folder

# Step 2: Set up Selenium with implicit wait
def setup_selenium():
    options = webdriver.FirefoxOptions()
    driver = webdriver.Firefox(service=Service(GeckoDriverManager().install()), options=options)
    options.set_capability("javascriptEnabled", True)
    driver.implicitly_wait(10)  # Set implicit wait to 10 seconds
    return driver

# Step 3: Log in to the website
def login_to_website(driver, username, password):
    driver.get('https://pmfby.gov.in/')  # Replace with the actual login URL
    
    # Click on the "Sign in" button to open the login form
    sign_in_button = driver.find_element(By.CSS_SELECTOR, 'a[title="Sign in"]')
    logger.info("Found sign in button")
    sign_in_button.click()
    logger.info("Clicked on sign in button")
    time.sleep(2)  # Wait for the login form to appear

    try:
        # Find username and password fields and login
        username_field = driver.find_element(By.NAME, 'username')
        password_field = driver.find_element(By.NAME, 'password')

        username_field.send_keys(username)
        password_field.send_keys(password)

        # Wait for CAPTCHA completion and then click the login button
        logger.info("Please complete the CAPTCHA manually if prompted.")
        time.sleep(30)  # Adjust time based on CAPTCHA complexity or manual entry

        login_button = driver.find_element(By.CSS_SELECTOR, 'button.custom__loginButton___1xEEs')
        login_button.click()

        # Check for the modal after login and handle it if it appears
        time.sleep(5)  # Wait for the modal to potentially appear
        try:
            submit_button = driver.find_element(By.CSS_SELECTOR, 'button.custom__customPrimaryButton___2D9kg.custom__btnPrimary___1GAxP.custom__btnSubmitSSSYID___9OU86.btn.btn-default')
            submit_button.click()
            logger.info("Modal handled successfully.")
        except Exception as e:
            logger.warning(f"No modal appeared: {str(e)}")
        
    except Exception as e:
        logger.error(f"Error during login: {str(e)}")

# Step 4: Navigate to the required section before fetching data
def navigate_to_section(driver):
    time.sleep(4)
    try:
        # Find the "Application" link and click on it
        application_link = driver.find_element(By.XPATH, '//a[@href="/policyclaim"]')
        logger.info("Clicking on Application link...")
        application_link.click()

        time.sleep(1)  # Wait briefly to ensure the click is completed

        # Find the "Application Documents" link and click on it
        app_docs_link = driver.find_element(By.ID, 'policy-claim-tab-tab-2')
        logger.info("Clicking on Application Documents tab...")
        app_docs_link.click()

        time.sleep(1)  # Wait briefly to ensure the click is completed

        # Find the "Paid Applications" link and click on it
        paid_apps_link = driver.find_element(By.XPATH, '//a[@title="Paid Applications" and @href="/policyclaim/paid?status=2&source=other"]')
        logger.info("Clicking on Paid Applications link...")
        paid_apps_link.click()

        time.sleep(2)  # Optional: Wait for the page to load completely

    except Exception as e:
        logger.error(f"Error navigating to paid applications: {str(e)}")

# Step 5: Fetch data and download files
def fetch_data(driver, unique_number):
    logger.info(f"Fetching data for unique number: {unique_number}")

    logger.info("Attempting to locate input field...")

    try:
       # Locate the input field using the provided CSS selector
        utr_search = WebDriverWait(driver, 10).until(
            EC.element_to_be_clickable((By.CSS_SELECTOR, '#policy-claim-tab-pane-2 > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > div:nth-child(1) > input:nth-child(1)'))
        )
        driver.execute_script("arguments[0].scrollIntoView(true);", utr_search)
        
        actions = ActionChains(driver)
        actions.move_to_element(utr_search).perform()

        # Ensure the input field is enabled before interacting
        if not utr_search.is_enabled():
            logger.info("Input field is not enabled, attempting to enable it.")
            driver.execute_script("arguments[0].removeAttribute('disabled')", utr_search)

        # Additional check for input field attributes
        logger.info(f"Input field enabled: {utr_search.is_enabled()}")
        logger.info(f"Input field displayed: {utr_search.is_displayed()}")
        logger.info(f"Input field location: {utr_search.location}")
        logger.info(f"Input field size: {utr_search.size}")

        if utr_search.is_enabled() and utr_search.is_displayed():
            logger.info("Input field is interactable. Attempting to interact...")

            utr_search.click()  # Click on the input field
            logger.info("Clicked on input field")

            utr_search.clear()  # Clear any existing text
            logger.info("Cleared input field")

            logger.info(f"Entering search term: {unique_number}")
            utr_search.send_keys(unique_number)

            # Find and click the search button
            search_button = WebDriverWait(driver, 10).until(
                EC.element_to_be_clickable((By.XPATH, '/html/body/div/div/div[1]/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div/div[4]/div[2]/button'))
            )
            logger.info(f"Clicking search button for {unique_number}...")
            search_button.click()

            time.sleep(2)  # Wait for the results to load

            # Loop through each entry and click the download button
            downloaded_files = []
            entries = WebDriverWait(driver, 10).until(
                EC.presence_of_all_elements_located((By.CSS_SELECTOR, 'a[title="File Download"]'))
            )
            for index, entry in enumerate(entries, start=1):
                try:
                    logger.info(f"Downloading file {index} for {unique_number}...")
                    entry.click()
                    time.sleep(2)  # Wait for the download to complete

                    # Move the downloaded file to the system's Downloads folder
                    downloaded_file_path = move_downloaded_file()

                    logger.info(f"File moved to Downloads folder: {downloaded_file_path}")
                    downloaded_files.append(downloaded_file_path)

                    # Check if 100 files have been downloaded, then extract and clear list
                    if len(downloaded_files) >= 100:
                        extract_files(unique_number, downloaded_files)
                        downloaded_files = []

                except Exception as e:
                    logger.error(f"Error clicking download for {unique_number}: {str(e)}")

            return downloaded_files

        else:
            logger.warning("UTR Search input field is still not interactable. Skipping interaction...")

    except Exception as e:
        # Capture the HTML of the problematic area for debugging
        html_source = driver.page_source
        debug_html_path = os.path.join(os.path.expanduser("~"), "Downloads", f'debug_{unique_number}.html')
        with open(debug_html_path, 'w', encoding='utf-8') as f:
            f.write(html_source)
        
      #  logger.error(f"Error interacting with utrSearch input field for {unique_number}: {str(e)}")
      #  logger.info(f"HTML source saved at {debug_html_path}")

        # Save a screenshot for further investigation
      #  screenshot_path = os.path.join(os.path.expanduser("~"), "Downloads", f'screenshot_{unique_number}.png')
       # driver.save_screenshot(screenshot_path)
       # logger.info(f"Screenshot saved at {screenshot_path} for {unique_number}")

# Function to move downloaded file to Downloads folder
def move_downloaded_file():
    # Replace this with your logic to get the downloaded file path
    downloaded_file_path = "mdlm"

    # Move the downloaded file to the system's Downloads folder
    destination_folder = os.path.expanduser("~/Downloads")  # Get the Downloads folder path
    shutil.move(downloaded_file_path, destination_folder)

    return os.path.join(destination_folder, os.path.basename(downloaded_file_path))

# Step 6: Zip the downloaded files
def zip_files(file_paths):
    output_zip_path = os.path.join(os.path.expanduser("~"), "Downloads", OUTPUT_ZIP)
    with zipfile.ZipFile(output_zip_path, 'a') as zipf:
        for file_path in file_paths:
            zipf.write(file_path, os.path.basename(file_path))

# Function to extract files into a folder
def extract_files(unique_number, file_paths):
    # Create a folder based on unique_number
    extract_folder = os.path.join(os.path.expanduser("~"), "Downloads", f'{unique_number}_extracted')
    os.makedirs(extract_folder, exist_ok=True)

    # Extract each file into the folder
    for file_path in file_paths:
        with zipfile.ZipFile(file_path, 'r') as zip_ref:
            zip_ref.extractall(extract_folder)

    logger.info(f"Extracted files for {unique_number} into folder: {extract_folder}")

# Function to save the last processed index
def save_last_index(index):
    with open(LAST_INDEX_FILE, 'w') as f:
        f.write(str(index))

# Function to load the last processed index
def load_last_index():
    try:
        with open(LAST_INDEX_FILE, 'r') as f:
            return int(f.read().strip())
    except FileNotFoundError:
        return 0

# Main function to orchestrate the process
def main():
    # Load the last processed index
    last_index = load_last_index()

    driver = setup_selenium()
    login_to_website(driver, ' 9599335757', 'Deepmala@2018')  # Replace with your actual credentials
    navigate_to_section(driver)

    downloaded_files = []
    for index, number in enumerate(unique_numbers[last_index:], start=last_index):
        try:
            downloaded_files.extend(fetch_data(driver, number))

            # Save the current index after each successful download
            save_last_index(index + 1)

        except Exception as e:
            logger.error(f"Failed to fetch data for {number}: {str(e)}")

    # Zip any remaining downloaded files
    if downloaded_files:
        zip_files(downloaded_files)

    driver.quit()

if __name__ == "__main__":
    main()
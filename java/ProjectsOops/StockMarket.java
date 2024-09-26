package ProjectsOops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        Market market = new Market();
        UserProfile usersProfile = new UserProfile("Chandu", 10000);

        while (true) {
            market.fluctuatePrice(); // stock price fluctuation
            System.out.println("\nAvailable stocks:");
            for (Stock stock : market.getStockPriceslist()) {
                System.out.println(stock);
            }

            System.out.println(
                    "1. Buy Stock\n2. Sell Stock\n3. Show Portfolio\n4. Exit\n5. Show balance\n6. Add funds");
            System.out.print("Choose an option: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1: // Buy stock
                    System.out.println("Enter the stock ticker: ");
                    String ticker = s.next();
                    System.out.println("Enter quantity: ");
                    int quantity = s.nextInt();

                    boolean stockFound = false;
                    for (Stock stock : market.getStockPriceslist()) {
                        if (stock.getTicker().equals(ticker)) {
                            stockFound = true;
                            usersProfile.buyStock(stock, quantity);
                            break; // Stop checking after buying the stock
                        }
                    }
                    if (!stockFound) {
                        System.out.println("Stock not found in the market.");
                    }
                    break;

                case 2: // Sell stock
                    System.out.println("Enter the stock ticker: ");
                    ticker = s.next();
                    System.out.println("Enter quantity: ");
                    int sellQuantity = s.nextInt();

                    stockFound = false;
                    for (Stock stock : market.getStockPriceslist()) {
                        if (stock.getTicker().equals(ticker)) {
                            stockFound = true;
                            usersProfile.sellStock(stock, sellQuantity);
                            break; // Stop checking after selling the stock
                        }
                    }
                    if (!stockFound) {
                        System.out.println("Stock not found in your portfolio.");
                    }
                    break;

                case 3: // Show portfolio
                    usersProfile.showPortfolio();
                    break;

                case 4: // Exit
                    System.out.println("Exiting...");
                    s.close();
                    return;

                case 5: // Show balance
                    System.out.printf("Your current balance is: $%.2f\n", usersProfile.getBalance());
                    break;

                case 6: // Add funds
                    System.out.println("Enter the amount to add: ");
                    double fund = s.nextDouble();
                    usersProfile.addFunds(fund);
                    System.out.printf("Funds added! New balance: $%.2f\n", usersProfile.getBalance());
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

// Stock class
class Stock {
    private String ticker;
    private String name;
    private double price;

    public Stock(String ticker, String name, double price) {
        this.ticker = ticker;
        this.name = name;
        this.price = price;
    }

    public String getTicker() {
        return ticker;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s (%s): $%.2f", name, ticker, price);
    }
}

// UserProfile class
class UserProfile {
    private String name;
    private double balance;
    private HashMap<String, Integer> portfolio; // stock ticker -> quantity

    public UserProfile(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.portfolio = new HashMap<>();
    }

    public void addFunds(double fund) {
        balance += fund; // Add funds to the balance
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void buyStock(Stock stock, int quantity) throws InterruptedException {
        double totalCost = stock.getPrice() * quantity;
        if (totalCost <= balance) {
            balance -= totalCost;
            portfolio.put(stock.getTicker(), portfolio.getOrDefault(stock.getTicker(), 0) + quantity);
            System.out.println("please wait...");
            Thread.sleep(3000);
            System.out.printf("Bought %d shares of %s for $%.2f each.\n", quantity, stock.getTicker(),
                    stock.getPrice());
        } else {
            System.out.println("Insufficient balance to buy stocks.");
        }
    }

    public void sellStock(Stock stock, int quantity) throws InterruptedException {
        int currentQuantity = portfolio.getOrDefault(stock.getTicker(), 0);
        if (currentQuantity >= quantity) {
            portfolio.put(stock.getTicker(), currentQuantity - quantity);
            double totalEarnings = stock.getPrice() * quantity;
            balance += totalEarnings;
            System.out.println("please wait....");
            Thread.sleep(3000);
            System.out.printf("Sold %d shares of %s for $%.2f each.\n", quantity, stock.getTicker(), stock.getPrice());
        } else {
            System.out.println("You don't own enough shares to sell.");
        }
    }

    public void showPortfolio() {
        System.out.println("Current Portfolio:");
        portfolio.forEach((ticker, quantity) -> {
            System.out.printf("%s: %d shares\n", ticker, quantity);
        });
        
        System.out.printf("Balance: $%.2f\n", balance);
    }
}

// Market class
class Market {
    private List<Stock> stocks;
    private Random random;

    public Market() {
        stocks = new ArrayList<>();
        random = new Random();
        initializeStock();
    }

    public void initializeStock() {
        stocks.add(new Stock("AAPL", "Apple", 150));
        stocks.add(new Stock("RELI", "Reliance", 2000));
        stocks.add(new Stock("TATA", "Tata", 500));
        stocks.add(new Stock("ADAN", "Adani", 100));
    }

    public void fluctuatePrice() {
        for (Stock stock : stocks) {
            double change = (random.nextDouble() - 0.5) * 10; // Fluctuate price between -5 to +5
            stock.setPrice(Math.max(1.0, stock.getPrice() + change)); // Ensure price doesn't go below 1
        }
    }

    public List<Stock> getStockPriceslist() {
        return stocks;
    }
}

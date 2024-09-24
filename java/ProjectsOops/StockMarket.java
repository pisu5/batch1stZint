package ProjectsOops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Market market = new Market();
        UserProfile usersProfile = new UserProfile("Chandu", 10000);
        while (true) {
            market.fluctuatePrice(); // stock price
            System.out.println("\nAvilable stocks");
            for (Stock stock : market.getStockPriceslist()) {
                System.out.println(stock);

            }
            System.out.println(
                    "1. Buy Stock\n2. Sell Stock\n3. Show Portfolio\n4. Exit \n5. Show balance \n6. Add fund ");
            System.out.print("Choose an option: ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the stock ticker"); //
                    String ticker = s.next();
                    System.out.println("Enter quantity");
                    int qunt = s.nextInt();
                    for (Stock stock : market.getStockPriceslist()) {
                        // System.out.println(stock);
                        if (stock.getTicker().equals(ticker)) {
                            System.out.println("ticker match");
                            usersProfile.buyStock(stock, qunt);
                        } else {
                            System.out.println("company does not exit in tyour portfolio");
                        }

                    }
                    break;
                case 2:
                    System.out.println("Enter the stock ticker");
                    ticker = s.next();
                    System.out.println("Enter quantity");
                    int Sellqunttity = s.nextInt();
                    for (Stock stock : market.getStockPriceslist()) {
                        if (stock.getTicker().equals(ticker)) {
                            usersProfile.sellStock(stock, Sellqunttity);
                        }

                    }
                    break;

                case 3:
                    usersProfile.showPortfolio();
                    break;
                case 5:
                    double b = usersProfile.getBalance();
                    System.out.println(b);
                case 6:
                    System.out.println("Please enter fund that you want to add");
                    double fund = s.nextDouble();
                    usersProfile.setbalance(fund);

                case 4:
                    System.out.println("Exiting...");
                    s.close();
                    return;
                default:
                    System.out.println("Invalid choice");

            }
        }

    }

}

public class Stock {
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

public class UserProfile {
    private String name;
    private double balance;
    private HashMap<String, Integer> portfolio; // stock ticker -> quantity

    public UserProfile(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.portfolio = new HashMap<>();
    }

    public void setbalance(double fund) {
        balance = fund;
       
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void buyStock(Stock stock, int quantity) {
        double totalCost = stock.getPrice() * quantity;
        if (totalCost <= balance) {
            balance -= totalCost;
            portfolio.put(stock.getTicker(), portfolio.getOrDefault(stock.getTicker(), 0) + quantity);
            System.out.printf("Bought %d shares of %s for $%.2f each.\n", quantity, stock.getTicker(),
                    stock.getPrice());
        } else {
            System.out.println("Insufficient balance to buy stocks.");
        }
    }

    public void sellStock(Stock stock, int quantity) {
        if (portfolio.getOrDefault(stock.getTicker(), 0) >= quantity) {
            portfolio.put(stock.getTicker(), portfolio.get(stock.getTicker()) - quantity);
            double totalEarnings = stock.getPrice() * quantity;
            balance += totalEarnings;
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

    
   
  


class Market {
    private List<Stock> stocks;
    private Random random;

    public Market() {
        stocks = new ArrayList<>();
        random = new Random();
        initilizeStcok();
    }

    public void initilizeStcok() {
        stocks.add(new Stock("Apple.inc", "Apple", 20000));
        stocks.add(new Stock("Releiance.ltd", "Releiance", 2000));
        stocks.add(new Stock("tata.inc", "tata", 200));
        stocks.add(new Stock("adani.pow", "adani", 20));

    }

    public void fluctuatePrice() {
        for (Stock stock : stocks) {
            double change = (random.nextDouble() - 0.5) * 10; // -5 to 5
            stock.setPrice((Math.max(1.0, stock.getPrice() + change)));
        }

    }

    public List<Stock> getStockPriceslist() {
        return stocks;
    }
}

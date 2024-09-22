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
        UsersProfile usersProfile = new UsersProfile("Chandu", 10000);
        while (true) {
            market.fluctuatePrice(); // stock price
            System.out.println("\nAvilable stocks");
            for (Stock stock : market.getStockPriceslist()) {
                System.out.println(stock);

            }
            System.out.println("1. Buy Stock\n2. Sell Stock\n3. Show Portfolio\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the stock ticker");
                    String ticker = s.next();
                    System.out.println("Enter quantity");
                    int qunt = s.nextInt();
                    for (Stock stock : market.getStockPriceslist()) {
                        if (stock.getTicker().equals(ticker)) {
                            usersProfile.buyStock(stock, qunt);
                        }

                    }
                    break;
                case 2:
                    System.out.println("Enter the stock ticker");
                    ticker = s.nextLine();
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

class Stock {
    private String ticker; // shorthand nnam of share
    private String name; /// zomato
    private double price; // share price

    public Stock(String ticker, String name, double price) {
        this.ticker = ticker;
        this.name = name;
        this.price = price;

    }

    public String getTicker() {
        return ticker;
    }

    public String name() {
        return name;
    }

    public double getPrice() {
        return price;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return String.format("%s,(%s): $%,2f", name, ticker, price);

    }

}

class UsersProfile {
    private String name;
    private double balance;
    private HashMap<String, Integer> portfolio;

    public UsersProfile(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.portfolio = new HashMap<>();
    }

    public String getname() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void buyStock(Stock stock, int qunatity) {
        double totalPrice = (stock.getPrice() * qunatity); // totalBuying price
        if (balance >= totalPrice) {
            balance -= totalPrice;
            portfolio.put(stock.getTicker(), portfolio.getOrDefault(stock.getTicker(), 0) + qunatity);
            System.out.println("purched");
        } else {
            System.out.println("insuffiecient balance");
        }

    }

    public void sellStock(Stock stock, int qunatity) {
        if (portfolio.getOrDefault(stock.getTicker(), 0) > qunatity) {
            portfolio.put(stock.getTicker(), portfolio.get(stock.getTicker()) - qunatity);
            double earning = stock.getPrice() * qunatity;
            balance += earning;
            // balance = balance+earning;
            System.out.println("successfully sold out shares of comaapany" + " " + stock.getTicker());

        } else {
            System.out.println("not engough shares of company" + " " + stock.getTicker() + " " + "to sell");
        }

    }

    public void showPortfolio() {
        System.out.println("Your current portfolio : ");
        portfolio.forEach((ticker, qunatity) -> {
            System.out.printf("%s : %d shares\n", ticker, qunatity);

        });
    }
}

class Market {
    private List<Stock> stocks;
    private Random random;

    public Market() {
        stocks = new ArrayList<>();
        random = new Random();
    }

    public void initilizeStcok(){
        stocks.add(new Stock("Apple.inc" ,"Apple",20000));
        stocks.add(new Stock("Releiance.ltd" ,"Releiance",2000));
        stocks.add(new Stock("tata.inc" ,"tata",200));
        stocks.add(new Stock("adani.pow" ,"adani",20);


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

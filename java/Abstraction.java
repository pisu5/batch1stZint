public class Abstraction {
    public static void main(String[] args) {
        CreditCardPayments creditCard  = new CreditCardPayments(20000.00,"123-555-555-555-4444-5");
        creditCard.makePayment();
        creditCard.paymentSummary();

    }
}

abstract class Payment {
    private double amount;

    public Payment(double am) {
        amount = am;
    }

    public double getAmount() {
        return amount;
    }

    public void paymentSummary() {
        System.out.println("Payment of ₹:" + amount + " " + "has been made");
    }

    abstract void makePayment(); // it cannot revels how it be donee
}

class CreditCardPayments
        extends Payment {
    private String creditcard;

    public CreditCardPayments(double amount, String creditCard) {
        super(amount);
        creditcard = creditCard;

    }

    // implement abstract method
    @Override
    void makePayment() {
        System.out.println("Processing payment of ₹ :"+ " "  + getAmount() + " " + "using card number" + " " + creditcard);

    }

}
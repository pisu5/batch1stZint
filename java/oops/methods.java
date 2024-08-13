package oops;

public class methods {
    public static void main(String[] args) {
        // starting point
        methods m = new methods();
        m.addMoney(30000);
        m.sendMoney(10);

    }

    public void chekBlance() {
        System.out.println("My Bank balance is" + " " + "20000");

    }

    public void addMoney(int add) {
        int total = 20000;
        total += add;
        System.out.println("My total balance is" + " " + total);

    }

    public void sendMoney(int send) {
        int totalM = 50000;
        totalM -= send;
        System.out.println(totalM);
    }

}

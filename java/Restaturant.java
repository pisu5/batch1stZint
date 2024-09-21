import java.lang.Runnable;

public class Restaturant {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int processiong = (int) (Math.random() * 5) + 1;
            Order order = new Order(i, processiong);
            Thread orderThread = new Thread(new OrderProcessor(order));
            orderThread.start();
        }

    }

}

class Order {
    private final int orderId;
    private final int processingTime;

    public Order(int orderId, int processingTime) {
        this.orderId = orderId;
        this.processingTime = processingTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getProcessingTime() {
        return processingTime;
    }
}

class OrderProcessor implements Runnable {
    private final Order order;

    public OrderProcessor(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("Order Procession for id : " + " " + order.getOrderId());
        try {
           Thread.sleep(order.getProcessingTime());
        } catch (InterruptedException e) {
            System.out.println("order interuupted id is : " + " " + order.getOrderId());

        }
        System.out.println("Order process for id: " + " " + order.getOrderId() + " " + "Sucessfully completed");

    }

}

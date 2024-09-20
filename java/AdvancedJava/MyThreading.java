import java.lang.Thread;

public class MyThreading {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        MyThread th2 = new MyThread();
        th.run();
        th2.run();

    }

}
 
class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " :" + i);
            try {
                Thread.sleep(500);

            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }

}

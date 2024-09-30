package batch1.java.AdvancedJava;

public class ImplementQueue {
    public static void main(String[] args) {
        MyQueue  queue = new MyQueue();
        queue.put(45);

    }

}

class MyQueue {
    int arr[];
    int size;

    MyQueue(int size) {
        this.arr = new int[size];
        this.size = 0;
    }

    MyQueue() {
        this.arr = new int[10];
        this.size = 0;
    }

    public void put(int ele) {
        if (this.size == arr.length) {
            int nrr[] = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                nrr[i] = arr[i];

            }
            arr = nrr; // point o new array
        }
        arr[size] = ele;
        size++;

    }
}

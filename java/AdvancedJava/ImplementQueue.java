package batch1.java.AdvancedJava;

public class ImplementQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(1);
        queue.put(3);
        queue.put(5);
        queue.put(5);
        queue.put(7);
        queue.remove();

        System.out.println(queue.peek() + " " + "peek element");

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
        this.size = 10;
    }

    // add element in queue
    public void put(int ele) {
        if (this.size == arr.length) {
            int nrr[] = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                nrr[i] = arr[i];

            }
            arr = nrr; // point o new array
            arr[size] = ele;
            size++;
        } else {
            arr[size] = ele;
            size++;
        }

    }

    // remove ele,ent from queue
    public int remove() {
        if (this.size == 0) {
            System.out.println("empty");
            return -1;

        } else {
            int ele = arr[0];
            for (int i = 1; i < this.size; i++) {
                arr[i - 1] = arr[i];

            }
            this.size--;
            return ele;

        }
    }

    // shoew peelk

    public int peek() {
        if (this.size == 0) {
            System.out.println("There is no element");
            return -1;
        } else {
            return arr[0];
        }
    }

    // show queue
    public void show() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

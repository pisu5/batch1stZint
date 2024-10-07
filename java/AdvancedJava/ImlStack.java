package batch1.java.AdvancedJava;

import java.util.LinkedList;
import java.util.Queue;

public class ImlStack {
    public static void main(String[] args) {
        StackK stackK = new StackK();
        stackK.push(10);
        stackK.push(30);
        stackK.push(66);
        System.out.println(stackK.peek());
        
    }

}

class StackK {
    private Queue<Integer> q1 = new LinkedList<>();

    // push effiecient to add element in stack
    public void push(int x) {
        q1.add(x);

    }

    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        int size = q1.size();

        while (size > 1) {
            q1.add(q1.remove());
            size--;
        }
        return q1.remove();

    }

    public int peek() {
        if (q1.isEmpty()) {
            System.out.println("empty stack");
            return -1;
        }

        int size = q1.size();
        while (size > 1) {
            q1.add(q1.remove());
            size--;
        }
        int top = q1.remove();
        q1.add(top);
        return top;
    }

}

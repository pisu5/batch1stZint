package batch1.java.AdvancedJava;

import java.util.Queue;

import java.util.LinkedList;

public class Queue2 {
    public static void main(String[] args) {
        Queue2.addElement();

    }

    public static void addElement() {
        Queue<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(7);
        list.add(5);
        list.poll();
        System.out.println(list.peek());

    }
}

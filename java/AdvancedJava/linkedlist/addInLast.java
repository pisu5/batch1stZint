package batch1.java.AdvancedJava.linkedlist;

public class addInLast {
    public static void main(String[] args) {
        LinkedListttt list = new LinkedListttt();
        list.addNodeAtLast(45);
        list.addNodeAtLast(55);
        list.disply();

    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;

    }
}

class LinkedListttt {
    Node head;

    public void addNodeAtLast(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;

    }

    public void disply() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
        
    }

}
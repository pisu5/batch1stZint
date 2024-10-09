package batch1.java.AdvancedJava.linkedlist;

public class addInLast {
    public static void main(String[] args) {
        LinkedListttt list = new LinkedListttt();
        list.addNodeAtLast(45);
        list.addNodeAtLast(55);
        list.addNodeAtLast(35454);
       // list.removeFirst();
       // list.disply();

       int first = list.getFirst();
       System.out.println(first);

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

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            System.out.println("First node remove");
        }
    }

    public void removeLastNode() {
        if (head == null) {
            System.out.println("list empty");
        } else if (head.next == null) {
            head = null;
            System.out.println("last node removed");

        } else {
            Node tempn = head;
            // traverse list to find last node
            while (tempn.next != null) {
                tempn = tempn.next;

            }
            tempn.next = null;
            System.out.println("last node removed");

        }
    }

    public int getFirst(){
        if(head==null){
            System.out.println("list is empty");
            return -1;
        }else{
            return head.data;
        }
    }

}
package day6;


public class SinglyLinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }
   
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

   
    void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (pos == 1) {
            head = head.next; 
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid position.");
            return;
        }
        temp.next = temp.next.next;  
    }

   
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.print("Original list: ");
        list.display();

        list.deleteAtPosition(3);

        System.out.print("After deleting at position 3: ");
        list.display();
    }
}

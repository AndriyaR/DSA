package day5;
import java.util.Scanner;

public class DeleteHead {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

  
    void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
          
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }


    void deleteHead() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head.next == head) {
            System.out.println("Deleted node: " + head.data);
            head = null;
            return;
        }

      
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }

        System.out.println("Deleted node: " + head.data);
        head = head.next; 
        last.next = head; 
    }


    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteHead cll = new DeleteHead(); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes to insert: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            cll.insertAtTail(sc.nextInt());
        }

        System.out.println("\nList before deleting head:");
        cll.display();

        cll.deleteHead();

        System.out.println("\nList after deleting head:");
        cll.display();

    }
}

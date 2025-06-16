package day5;
import java.util.Scanner;

public class Deleteany {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

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
        System.out.println(data + " inserted at tail.");
    }

    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (position == 1) {
            if (head.next == head) {
                System.out.println(head.data + " deleted.");
                head = null;
                return;
            }

            Node last = head;
            while (last.next != head) {
                last = last.next;
            }

            System.out.println(head.data + " deleted.");
            head = head.next;
            last.next = head;
            return;
        }

        Node current = head;
        Node prev = null;
        int count = 1;

        while (count < position && current.next != head) {
            prev = current;
            current = current.next;
            count++;
        }

        if (count != position) {
            System.out.println("Position " + position + " is invalid.");
            return;
        }

        prev.next = current.next;
        System.out.println(current.data + " deleted.");
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        Deleteany list = new Deleteany();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes to insert: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int val = sc.nextInt();
            list.insertAtTail(val);
        }

        list.display();

        while (true) {
            System.out.print("\nEnter position to delete (or 0 to exit): ");
            int pos = sc.nextInt();
            if (pos == 0) {
                System.out.println("Exiting...");
                break;
            }
            list.deleteAtPosition(pos);
            list.display();
        }

        sc.close();
    }
}

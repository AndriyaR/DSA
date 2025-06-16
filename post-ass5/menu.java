package day5;

import java.util.Scanner;

public class menu {
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
            while (temp.next != head)
                temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
        }
        System.out.println(data + " inserted.");
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
        while (last.next != head)
            last = last.next;
        System.out.println("Deleted node: " + head.data);
        head = head.next;
        last.next = head;
    }

    void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (pos == 1) {
            deleteHead();
            return;
        }

        Node current = head;
        Node prev = null;
        int count = 1;

        while (count < pos && current.next != head) {
            prev = current;
            current = current.next;
            count++;
        }

        if (count != pos) {
            System.out.println("Position out of bounds.");
            return;
        }

        prev.next = current.next;
        System.out.println("Deleted node: " + current.data);
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
        CircularLinkedList cll = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at tail");
            System.out.println("2. Delete from head");
            System.out.println("3. Delete at position");
            System.out.println("4. Display list");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value to insert: ");
                int val = sc.nextInt();
                cll.insertAtTail(val);
            } else if (choice == 2) {
                cll.deleteHead();
            } else if (choice == 3) {
                System.out.print("Enter position to delete: ");
                int pos = sc.nextInt();
                cll.deleteAtPosition(pos);
            } else if (choice == 4) {
                cll.display();
            } else if (choice == 5) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}

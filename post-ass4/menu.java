package day4;

import java.util.Scanner;

public class menu {
    Node head;

    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void deleteMiddle() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        int size = getSize();
        int mid = size / 2;

        Node temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        if (temp == head) {
            head = head.next;
            if (head != null)
                head.prev = null;
        } else {
            if (temp.prev != null)
                temp.prev.next = temp.next;
            if (temp.next != null)
                temp.next.prev = temp.prev;
        }
        System.out.println("Deleted middle node with data: " + temp.data);
    }

    void traverseForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void traverseBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at end");
            System.out.println("2. Delete middle node");
            System.out.println("3. Traverse forward");
            System.out.println("4. Traverse backward");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value to insert: ");
                int val = sc.nextInt();
                dll.insertEnd(val);
            } else if (choice == 2) {
                dll.deleteMiddle();
            } else if (choice == 3) {
                dll.traverseForward();
            } else if (choice == 4) {
                dll.traverseBackward();
            } else if (choice == 5) {
                System.out.println("Exiting program.");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

       
    }
}

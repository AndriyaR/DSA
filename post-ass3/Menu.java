package day3;

import java.util.Scanner;

public class Menu {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void insertAtTail(int data) {
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

    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (position == 1) {
            System.out.println(head.data + " deleted from position 1");
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        int count = 1;
        while (temp != null && count < position) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }
        System.out.println(temp.data + " deleted from position " + position);
        prev.next = temp.next;
    }

    void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Menu list = new Menu();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at tail");
            System.out.println("2. Insert at position");
            System.out.println("3. Delete at position");
            System.out.println("4. Traverse");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter data to insert at tail: ");
                int data = sc.nextInt();
                list.insertAtTail(data);
            } else if (choice == 2) {
                System.out.print("Enter data to insert: ");
                int data = sc.nextInt();
                System.out.print("Enter position to insert at: ");
                int pos = sc.nextInt();
                list.insertAtPosition(data, pos);
            } else if (choice == 3) {
                System.out.print("Enter position to delete: ");
                int pos = sc.nextInt();
                list.deleteAtPosition(pos);
            } else if (choice == 4) {
                list.traverse();
            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }

       
    }
}

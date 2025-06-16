package day6;

import java.util.Scanner;

import day6.StackUsingLinkedList.Node;



public class menudriven {
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

  
    void delete(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++)
            temp = temp.next;
        if (temp.next == null) {
            System.out.println("Invalid position");
            return;
        }
        temp.next = temp.next.next;
    }

   
    void reverse() {
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

   
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menudriven list = new menudriven();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at end");
            System.out.println("2. Delete at position");
            System.out.println("3. Reverse list");
            System.out.println("4. Display list");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    int data = sc.nextInt();
                    list.insert(data);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int pos = sc.nextInt();
                    list.delete(pos);
                    break;
                case 3:
                    list.reverse();
                    System.out.println("List reversed.");
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}

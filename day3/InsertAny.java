package day3;

import java.util.Scanner;

public class InsertAny {
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
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAny sll = new InsertAny(); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter data for node " + i + ": ");
            sll.insertAtTail(sc.nextInt());
        }

        sll.traverse();

        System.out.print("Enter data to insert: ");
        int data = sc.nextInt();
        System.out.print("Enter position to insert at: ");
        int pos = sc.nextInt();

        sll.insertAtPosition(data, pos);
        sll.traverse();

        
    }
}

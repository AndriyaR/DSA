package day3;

import java.util.Scanner;

public class ReverseList {
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


    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;   
            current.next = prev;  
            prev = current;        
            current = next;        
        }
        head = prev;
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
        ReverseList sll = new ReverseList();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter data for node " + i + ": ");
            sll.insertAtTail(sc.nextInt());
        }

        System.out.println("Original list:");
        sll.traverse();

        sll.reverse();

        System.out.println("Reversed list:");
        sll.traverse();

     
    }
}

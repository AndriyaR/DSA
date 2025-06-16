package day6;

import java.util.Scanner;

import day6.StackUsingLinkedList.Node;

import java.util.Scanner;



public class ReverseSinglyLinkedList {
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

  
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseSinglyLinkedList list = new ReverseSinglyLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        System.out.println("Original list:");
        list.display();

        list.reverse();

        System.out.println("Reversed list:");
        list.display();

        
    }
}

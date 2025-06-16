package day3;

import java.util.Scanner;

public class DeleteAny {
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
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteAny sll = new DeleteAny(); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter data for node " + i + ": ");
            sll.insertAtTail(sc.nextInt());
        }

        sll.traverse();

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        sll.deleteAtPosition(pos);
        sll.traverse();

        
    }
}

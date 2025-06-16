package day6;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtPositionSLL {
    Node head;

   
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds!");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertAtPositionSLL list = new InsertAtPositionSLL();

        System.out.print("enter no of node to insert");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter data for node " + i + ": ");
            int data = sc.nextInt();
            list.insertAtPosition(data, i); 
        }

        list.display();

        System.out.print("Enter data to insert: ");
        int data = sc.nextInt();
        System.out.print("Enter position to insert at: ");
        int pos = sc.nextInt();

        list.insertAtPosition(data, pos);

        list.display();

        
    }
}

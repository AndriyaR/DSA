package day3;

import java.util.Scanner;

public class SinglyLinkedList {
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
        SinglyLinkedList sll = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter data for node " + i + ": ");
            int data = sc.nextInt();
            sll.insertAtTail(data);
        }

        sll.traverse();
        
    }


	public void insertAtPosition(int data, int pos) {
				
	}


	public void deleteAtPosition(int pos) {
		
		
	}


	public void reverse() {
		// TODO Auto-generated method stub
		
	}
}

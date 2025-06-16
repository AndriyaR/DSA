package day5;
import java.util.Scanner;



import java.util.Scanner;

public class CircularLinkedList {
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
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
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

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int val = sc.nextInt();
            cll.insertAtTail(val);
        }

        cll.display();

       
    }


	public void deletefromhead() {
		// TODO Auto-generated method stub
		
	}


	public void deleteHead() {
		// TODO Auto-generated method stub
		
	}


	public void deleteAtPosition(int pos) {
		// TODO Auto-generated method stub
		
	}
}

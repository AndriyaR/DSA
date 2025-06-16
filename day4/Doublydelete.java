package day4;

import java.util.Scanner;

import java.util.Scanner;



public class Doublydelete {
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
            System.out.println("List is empty. Nothing to delete.");
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
        System.out.println("Deleted node with data: " + temp.data);
    }

    
    void traverseForward() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Doublydelete dll = new Doublydelete();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            dll.insertEnd(sc.nextInt());
        }

        System.out.println("Before deleting middle node:");
        dll.traverseForward();

        dll.deleteMiddle();

        System.out.println("After deleting middle node:");
        dll.traverseForward();

       
    }
}

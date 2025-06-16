package day4;

import java.util.Scanner;



public class insert {
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

   
    void insertMiddle(int data) {
        Node newNode = new Node(data);
        int mid = getSize() / 2;

        if (head == null || mid == 0) {
            
            newNode.next = head;
            if (head != null) head.prev = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < mid - 1; i++) {
            temp = temp.next;
        }

        Node nextNode = temp.next;
        temp.next = newNode;
        newNode.prev = temp;

        newNode.next = nextNode;
        if (nextNode != null)
            nextNode.prev = newNode;
    }

    
    void traverseForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insert dll = new insert();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            dll.insertEnd(sc.nextInt());
        }

        System.out.print("Enter data to insert in middle: ");
        int midData = sc.nextInt();
        dll.insertMiddle(midData);

       
        dll.traverseForward();

        
    }
}

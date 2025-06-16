package day6;

import java.util.Scanner;

public class StackUsingLinkedList {
    Node top = null;

    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingLinkedList stack = new StackUsingLinkedList();

        System.out.println("Enter number of operations:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("1.Push 2.Pop: ");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.print("Enter value to push: ");
                int val = sc.nextInt();
                stack.push(val);
            } else if (op == 2) {
                int popped = stack.pop();
                if (popped != -1)
                    System.out.println("Popped: " + popped);
            } else {
                System.out.println("Invalid operation");
            }
        }
       
    }
}

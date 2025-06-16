package day4;

public class traversal{
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
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
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

    
    void traverseBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
       traversal dll = new traversal();

        dll.insertEnd(10);
        dll.insertEnd(20);
        dll.insertEnd(30);
        dll.insertEnd(40);

        dll.traverseForward();
        dll.traverseBackward();
    }
}


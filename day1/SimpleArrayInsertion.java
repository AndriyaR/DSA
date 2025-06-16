package day1;

import java.util.Scanner;

public class SimpleArrayInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[100];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Position to insert (0 to " + n + "): ");
        int pos = sc.nextInt();
        System.out.print("Value to insert: ");
        int val = sc.nextInt();

        if (pos < 0 || pos > n) {
            System.out.println("Invalid position!");
        } else {
            
            for (int i = n; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = val;
            n++;

            System.out.print("Array after insertion: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}

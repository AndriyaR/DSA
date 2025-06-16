package day2;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        
        Arrays.sort(arr);

       
        int j = 0; 

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

       
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }

    }
        
}

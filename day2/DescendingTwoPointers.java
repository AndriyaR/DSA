package day2;

import java.util.Scanner;
import java.util.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class DescendingTwoPointers {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = myobj.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = myobj.nextInt();

       
        Arrays.sort(arr);

        
        int i = 0, j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

       
        System.out.print("Descending order: ");
        for (int num : arr) System.out.print(num + " ");

       
    }
}


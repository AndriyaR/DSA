package day8;

import java.util.Scanner;

public class RecursiveBinarySearch {

    
    static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;  
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, left, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, right, target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of elements "
        		+ ": ");
        int n = sc.nextInt();

        int[] arr = new int[n];

  
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

      
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

       
        int result = binarySearch(arr, 0, n - 1, target);

        if (result == -1) {
            System.out.println(target + " not found in the array.");
        } else {
            System.out.println(target + " found at index " + result + ".");
        }

    }
}


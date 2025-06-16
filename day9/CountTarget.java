package day9;

import java.util.Scanner;

public class CountTarget {

    public static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

      
        System.out.println("Enter sorted elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();


        int lower = lowerBound(arr, target);
        int upper = upperBound(arr, target);

        int count = upper - lower;

        System.out.println("Count of " + target + " is: " + count);

     
    }
}

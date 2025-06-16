package day9;

import java.util.Scanner;

public class RankFinder {

   
    public static int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
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

     
        int pos = lowerBound(arr, target);
        if (pos < n && arr[pos] == target) {
            System.out.println("Element found at rank: " + (pos + 1));
        } else {
            System.out.println("Element not present. It would be inserted at rank: " + (pos + 1));
        }

    
    }
}

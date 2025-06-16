package day8;

import java.util.Scanner;

public class RotatedArray {

   
    static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            
            if (arr[left] <= arr[mid]) {
             
                if (target >= arr[left] && target < arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } 
            
            else {
                
                if (target > arr[mid] && target <= arr[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter rotated sorted elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int index = search(arr, target);

        if (index == -1)
            System.out.println(target + " not found.");
        else
            System.out.println(target + " found at index " + index + ".");

        
    }
}

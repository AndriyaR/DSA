package day7;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        mergeSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr)
            System.out.print(num + " ");

        sc.close();
    }

    // Helper method to sort the array
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;  // base case

        int mid = arr.length / 2;

        // Split left and right arrays
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < arr.length; i++)
            right[i - mid] = arr[i];

        // Recursively sort left and right
        mergeSort(left);
        mergeSort(right);

        // Merge sorted halves
        merge(arr, left, right);
    }

    // Merge two sorted arrays into original array
    public static void merge(int[] arr, int[] left, int[] right) {
        int i=0, j=0, k=0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
    }
}

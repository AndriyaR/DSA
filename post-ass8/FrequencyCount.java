package day8;

import java.util.Scanner;

public class FrequencyCount {
    

    static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (sorted array): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter element to find frequency: ");
        int target = sc.nextInt();

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        if (first == -1) {
            System.out.println(target + " not found in the array.");
        } else {
            int freq = last - first + 1;
            System.out.println("Frequency of " + target + ": " + freq);
        }

        sc.close();
    }
}

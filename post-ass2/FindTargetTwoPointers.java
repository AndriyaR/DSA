package day2;

import java.util.Scanner;

public class FindTargetTwoPointers {

    static boolean findTarget(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            if (arr[left] == target || arr[right] == target)
                return true;
            left++;
            right--;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        System.out.println(findTarget(arr, target) ? "Found" : "Not Found");

        sc.close();
    }
}


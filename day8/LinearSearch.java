package day8;

import java.util.Scanner;


import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

       
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

      
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

 
        if (index == -1) {
            System.out.println(target + " not found in the array.");
        } else {
            System.out.println(target + " found at index " + index + ".");
        }


    }
}

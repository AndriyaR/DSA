package day2;

import java.util.Scanner;

public class ReverseNumber {

    static String reverse(String num) {
        char[] arr = num.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); 
        String num = sc.next();              
        System.out.println("Reversed number: " + reverse(num));
        sc.close();
    }
}


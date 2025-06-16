package day2;

import java.util.Scanner;

public class PalindromeCheck {

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1; 
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string or number: ");
        String input = sc.next();
        System.out.println(isPalindrome(input) ? "Palindrome" : "Not Palindrome");
       
    }
}


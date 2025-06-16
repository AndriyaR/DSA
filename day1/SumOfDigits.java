package day1;

import java.util.Scanner;

public class SumOfDigits {
    static int sumDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumDigits(num));
        sc.close();
    }
}

package day1;

public class Factorial {
    static long factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}

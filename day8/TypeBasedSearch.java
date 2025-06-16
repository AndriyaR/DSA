package day8;

import java.util.Scanner;

public class TypeBasedSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data type (int/double/string): ");
        String type = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        int index = -1;

        switch (type) {
            case "int":
                int[] intArr = new int[n];
                System.out.println("Enter int elements:");
                for (int i = 0; i < n; i++) {
                    intArr[i] = sc.nextInt();
                }
                System.out.print("Enter int to search: ");
                int intTarget = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    if (intArr[i] == intTarget) {
                        index = i;
                        break;
                    }
                }
                break;

            case "double":
                double[] dblArr = new double[n];
                System.out.println("Enter double elements:");
                for (int i = 0; i < n; i++) {
                    dblArr[i] = sc.nextDouble();
                }
                System.out.print("Enter double to search: ");
                double dblTarget = sc.nextDouble();
                for (int i = 0; i < n; i++) {
                    if (dblArr[i] == dblTarget) {
                        index = i;
                        break;
                    }
                }
                break;

            case "string":
                String[] strArr = new String[n];
                System.out.println("Enter string elements:");
                for (int i = 0; i < n; i++) {
                    strArr[i] = sc.nextLine();
                }
                System.out.print("Enter string to search: ");
                String strTarget = sc.nextLine();
                for (int i = 0; i < n; i++) {
                    if (strArr[i].equals(strTarget)) {
                        index = i;
                        break;
                    }
                }
                break;

            default:
                System.out.println("Invalid data type.");
                sc.close();
                return;
        }

        if (index == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index " + index);

       
    }
}


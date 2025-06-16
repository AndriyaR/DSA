package day7;

import java.util.*;

public class BucketSortSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

       
        System.out.println("Enter " + n + "number:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

     
        int max = Arrays.stream(arr).max().getAsInt();

        int bucketCount = 10;
        List<Integer>[] buckets = new ArrayList[bucketCount];
        for (int i = 0; i < bucketCount; i++)
            buckets[i] = new ArrayList<>();

      
        for (int num : arr)
            buckets[num * bucketCount / (max + 1)].add(num);

       
        int index = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int num : bucket)
                arr[index++] = num;
        }

       
        System.out.println("Sorted array:");
        for (int num : arr)
            System.out.print(num + " ");
        
       
    }
}


package day9;

public class lowerbound {
    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 5, 12, 24, 35, 77};
        int target = 15;
        int left = 0;
        int right = arr.length;
        int mid;

        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

       
        System.out.println("Lower bound index for " + target + " is: " + left);
    }
}

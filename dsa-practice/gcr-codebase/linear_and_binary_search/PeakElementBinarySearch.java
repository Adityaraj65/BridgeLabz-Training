package linear_and_binary_search;

import java.util.Scanner;

public class PeakElementBinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        // binary search for peak element
        while (left <= right) {

            int mid = (left + right) / 2;

            // handle boundary cases
            boolean leftOk = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOk = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            // check if mid is peak
            if (leftOk && rightOk) {
                System.out.println("Peak element found: " + arr[mid]);
                System.out.println("Index: " + mid);
                break;
            }

            // move to left half
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // move to right half
            else {
                left = mid + 1;
            }
        }

        sc.close();
    }
}

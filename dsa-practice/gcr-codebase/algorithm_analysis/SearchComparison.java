package algorithm_analysis;
import java.util.Arrays;
public class SearchComparison {

    //linear search
    static int linearSearch(int[] arr, int target) {

        // Traverse the entire array
        for (int i = 0; i < arr.length; i++) {

            // Check if current element matches target
            if (arr[i] == target) {
                return i;   // target found, return index
            }
        }

        // Target not found in array
        return -1;
    }

  //binary search
    static int binarySearch(int[] arr, int target) {

        int low = 0;                  // starting index
        int high = arr.length - 1;    // ending index

        // Continue search until range is valid
        while (low <= high) {

            // Calculate mid index (prevents overflow)
            int mid = low + (high - low) / 2;

            // If target is found at mid
            if (arr[mid] == target) {
                return mid;
            }
            // If target is greater, search right half
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            // If target is smaller, search left half
            else {
                high = mid - 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {

        int n = 1_000_000;          // size of dataset
        int[] data = new int[n];    // array declaration

        // Fill array with values from 1 to n
        for (int i = 0; i < n; i++) {
            data[i] = i + 1;
        }

        int target = n; // element to be searched

        // linear seac=rch time
        long start = System.nanoTime();   // start time
        linearSearch(data, target);       // call linear search
        long linearTime = System.nanoTime() - start; // end time

        // sorting array for binary search
        Arrays.sort(data);

        // binary search time
        start = System.nanoTime();         // start time
        binarySearch(data, target);        // call binary search
        long binaryTime = System.nanoTime() - start; // end time

        // Print execution times
        System.out.println("Linear Search Time: " + linearTime + " ns");
        System.out.println("Binary Search Time: " + binaryTime + " ns");
    }
}

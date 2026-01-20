package algorithm_analysis;
import java.util.Arrays;
public class SortingComparison {

    // bubble sort
    static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for swapping adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //merge sort
    static void mergeSort(int[] arr, int left, int right) {

        // Divide array until single element remains
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);       // sort left half
            mergeSort(arr, mid + 1, right);  // sort right half

            merge(arr, left, mid, right);    // merge both halves
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // Merge two sorted halves
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        // Copy remaining elements
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        // Copy back to original array
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
    }

    //quick sort
    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // Partition index
            int pi = partition(arr, low, high);

            // Sort left and right partitions
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // pivot element
        int i = low - 1;

        // Rearrange elements based on pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static void main(String[] args) {

        int n = 10000;                 // dataset size
        int[] data1 = new int[n];
        int[] data2 = new int[n];
        int[] data3 = new int[n];

        // Fill array with random values
        for (int i = 0; i < n; i++) {
            int value = (int) (Math.random() * n);
            data1[i] = value;
            data2[i] = value;
            data3[i] = value;
        }

        // bubble sort time
        long start = System.nanoTime();
        bubbleSort(data1);
        long bubbleTime = System.nanoTime() - start;

        // merge sort time
        start = System.nanoTime();
        mergeSort(data2, 0, data2.length - 1);
        long mergeTime = System.nanoTime() - start;

        // quick sort time
        start = System.nanoTime();
        quickSort(data3, 0, data3.length - 1);
        long quickTime = System.nanoTime() - start;

        // Print execution times
        System.out.println("Bubble Sort Time: " + bubbleTime + " ns");
        System.out.println("Merge Sort Time: " + mergeTime + " ns");
        System.out.println("Quick Sort Time: " + quickTime + " ns");
    }

}


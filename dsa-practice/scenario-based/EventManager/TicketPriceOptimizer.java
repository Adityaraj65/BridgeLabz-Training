package EventManager;

class TicketPriceOptimizer {

    // Public method
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            quickSort(prices, low, pivotIndex - 1);   // left side
            quickSort(prices, pivotIndex + 1, high);  // right side
        }
    }

    // Partition logic
    private static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                swap(prices, i, j);
            }
        }

        swap(prices, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


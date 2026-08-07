package day6;

public class FirstAndLastOccurrence {

    static int comparisons;

    public static int findFirst(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        int ans = -1;        
        comparisons = 0;

        while (low <= high) {

            comparisons++;
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;

            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Finds the last occurrence of the target
    public static int findLast(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        comparisons = 0;
        while (low <= high) {
            comparisons++;
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;

            } else if (arr[mid] < target) {

                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 4, 7, 9, 9, 12};
        int[] targets = {4, 9, 5};
        for (int target : targets) {
            int first = findFirst(arr, target);
            int firstComparisons = comparisons;
            int last = findLast(arr, target);
            int lastComparisons = comparisons;

            System.out.println("Target : " + target);
            System.out.println("First Occurrence : " + first);
            System.out.println("Last Occurrence  : " + last);
            System.out.println("Comparisons (First Search) : " + firstComparisons);
            System.out.println("Comparisons (Last Search)  : " + lastComparisons);
            System.out.println();
        }
    }
}

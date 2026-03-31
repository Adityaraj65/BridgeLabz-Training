public class BinarySearch704 {

    public static void main(String[] args) {
        // Given sorted array
        int[] nums = {-1, 0, 3, 5, 9, 12};

        // Target element to search
        int target = 9;

        // Calling search method and printing result
        System.out.println(search(nums, target));
    }

    // Method to perform Binary Search
    public static int search(int[] nums, int target) {

        // Initialize low and high pointers
        int low = 0;
        int high = nums.length - 1;

        // Loop until search space is valid
        while (low <= high) {

            // Calculate mid to avoid overflow
            int mid = low + (high - low) / 2;

            // If target found, return index
            if (nums[mid] == target) {
                return mid;
            }
            // If target is greater, ignore left half
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                high = mid - 1;
            }
        }

        // Target not found
        return -1;
    }
}

public class ValidPerfectSquare367 {

    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    // Checks if num is a perfect square
    public static boolean isPerfectSquare(int num) {

        long low = 1;
        long high = num;

        // Binary search between 1 and num
        while (low <= high) {

            long mid = low + (high - low) / 2;
            long square = mid * mid;

            // If square matches number
            if (square == num) {
                return true;
            }
            // If square is smaller, search right side
            else if (square < num) {
                low = mid + 1;
            }
            // If square is larger, search left side
            else {
                high = mid - 1;
            }
        }

        // No perfect square found
        return false;
    }
}


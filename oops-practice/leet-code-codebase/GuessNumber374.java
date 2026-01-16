public class GuessNumber374 {

    // Simulated picked number
    static int pick = 6;

    // API simulation
    static int guess(int num) {
        if (num > pick) return -1;
        if (num < pick) return 1;
        return 0;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(guessNumber(n));
    }

    // Binary search to find picked number
    public static int guessNumber(int n) {

        int low = 1;
        int high = n;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int res = guess(mid);

            // Found the number
            if (res == 0) {
                return mid;
            }
            // Picked number is lower
            else if (res < 0) {
                high = mid - 1;
            }
            // Picked number is higher
            else {
                low = mid + 1;
            }
        }

        return -1;
    }
}


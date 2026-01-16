public class FirstBadVersion278 {

    // Simulated API (LeetCode provides this)
    static boolean isBadVersion(int version) {
        // Suppose version 4 onwards are bad
        return version >= 4;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(firstBadVersion(n));
    }

    // Finds the first bad version using Binary Search
    public static int firstBadVersion(int n) {

        int low = 1;
        int high = n;

        // Search until only one version remains
        while (low < high) {

            // Prevent overflow
            int mid = low + (high - low) / 2;

            // If mid is bad, first bad version is on left side (including mid)
            if (isBadVersion(mid)) {
                high = mid;
            }
            // Else first bad version must be on right side
            else {
                low = mid + 1;
            }
        }

        // low == high pointing to first bad version
        return low;
    }
}


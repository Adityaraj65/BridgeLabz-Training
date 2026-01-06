public class Leetcode28 {

    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;

            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    // Main method for local testing
    public static void main(String[] args) {

        Leetcode28 sol = new Leetcode28();

        String haystack = "sadbutsad";
        String needle = "sad";

        int result = sol.strStr(haystack, needle);

        System.out.println("Index found at: " + result);
    }
}

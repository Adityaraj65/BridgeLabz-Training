package Hashmap;

import java.util.HashMap;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] arr) {

        // HashMap to store each number and mark it as present
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Step 1: Put all elements in map
        for (int num : arr) {
            map.put(num, true);
        }

        int longest = 0;

        // Step 2: Check for consecutive sequence
        for (int num : arr) {

            int currentNum = num;
            int count = 0;

            // Keep checking next consecutive numbers
            while (map.containsKey(currentNum)) {
                count++;
                currentNum++;
            }

            // Update longest length
            longest = Math.max(longest, count);
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(arr)); // Output: 4
    }
}

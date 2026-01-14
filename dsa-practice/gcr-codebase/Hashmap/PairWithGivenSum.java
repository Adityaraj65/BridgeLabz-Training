package Hashmap;

import java.util.HashMap;

class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {

        // HashMap to store numbers we have already seen
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Traverse array
        for (int num : arr) {

            // Calculate number needed to reach target
            int required = target - num;

            // If required number is already seen, pair exists
            if (map.containsKey(required)) {
                return true;
            }

            // Mark current number as seen
            map.put(num, true);
        }

        // No pair found
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println(hasPair(arr, target));
    }
}


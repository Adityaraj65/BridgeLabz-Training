package Hashmap;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

class ZeroSumSubarrays {

    public static void findSubarrays(int[] arr) {

        // Map stores prefixSum -> list of indices
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        // Sum 0 at index -1 (important base case)
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // If sum already exists, zero-sum subarray found
            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println("Subarray: " + (startIndex + 1) + " to " + i);
                }
            }

            // Add current index to map
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, -4, -2, -2};
        findSubarrays(arr);
    }
}


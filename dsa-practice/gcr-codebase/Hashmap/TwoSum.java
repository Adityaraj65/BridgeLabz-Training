package Hashmap;

import java.util.HashMap;

class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        // HashMap stores: number -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // Number needed to reach target
            int needed = target - nums[i];

            // If already present, solution found
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            // Store current number with index
            map.put(nums[i], i);
        }

        // If no solution
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]); // 0 1
    }
}

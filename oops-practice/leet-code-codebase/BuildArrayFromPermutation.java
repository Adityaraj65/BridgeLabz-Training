class BuildArrayFromPermutation {

    // LeetCode method
    public static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    // main method for local testing
    public static void main(String[] args) {

        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] result = buildArray(nums);

        // printing output
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}

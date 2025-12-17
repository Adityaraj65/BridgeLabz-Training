import java.util.*;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        LargestNumber obj = new LargestNumber();
        System.out.println(obj.dominantIndex(nums));
    }

    public int dominantIndex(int[] nums) {
        int idx = -1;
        int max1 = -1;
        int max2 = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                idx = i;
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        return max1 >= 2 * max2 ? idx : -1;
    }
}

import java.util.Scanner;

public class Leetcode1295 {

    // Method to count numbers with even number of digits
    public static int findNumbers(int[] nums) {

        int output = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int num = nums[i];   // store original value to avoid modifying array

            while (num > 0) {
                num = num / 10;
                count++;
            }

            if (count % 2 == 0) {
                output++;
            }
        }
        return output;
    }

    // main method to run in VS Code
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call method and print result
        int result = findNumbers(nums);
        System.out.println("Count of numbers with even digits: " + result);

        sc.close();
    }
}

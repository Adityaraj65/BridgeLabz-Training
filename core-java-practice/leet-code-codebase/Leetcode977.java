import java.util.Arrays;
import java.util.Scanner;

public class Leetcode977 {

    // Method to return sorted squares of the array
    public static int[] sortedSquares(int[] nums) {

        int[] num2 = new int[nums.length];

        // Squaring each element
        for (int i = 0; i < nums.length; i++) {
            num2[i] = nums[i] * nums[i];
        }

        // Sorting the squared array
        Arrays.sort(num2);

        return num2;
    }

    // main method to make it runnable in VS Code
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Take array elements input
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call the method
        int[] result = sortedSquares(nums);

        // Print the result
        System.out.println("Sorted squares array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}

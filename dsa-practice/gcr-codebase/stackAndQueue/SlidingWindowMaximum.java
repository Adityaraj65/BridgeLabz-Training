package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

class SlidingWindowMaximum {

    public static void maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {

            // Remove indices out of current window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from back
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Window starts after k - 1
            if (i >= k - 1) {
                System.out.print(nums[deque.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        maxSlidingWindow(nums, k);
    }
}


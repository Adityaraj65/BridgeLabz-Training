package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

class StockSpan {

    public static int[] calculateSpan(int[] prices) {

        int n = prices.length;
        int[] span = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Remove all previous prices smaller or equal
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty → span is i + 1
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = calculateSpan(prices);

        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}


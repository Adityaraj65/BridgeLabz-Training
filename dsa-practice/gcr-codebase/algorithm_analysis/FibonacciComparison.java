package algorithm_analysis;

public class FibonacciComparison {

    //recursive fibonacci
    // Time Complexity: O(2^N)
    static int fibonacciRecursive(int n) {

        // Base condition
        if (n <= 1)
            return n;

        // Recursive calls
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // iterative fibonacci
    // Time Complexity: O(N)
    static int fibonacciIterative(int n) {

        if (n <= 1)
            return n;

        int a = 0, b = 1, sum = 0;

        // Calculate Fibonacci using loop
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return b;
    }

    public static void main(String[] args) {

        int n = 30;

        // Recursive execution time
        long start = System.nanoTime();
        fibonacciRecursive(n);
        long recursiveTime = System.nanoTime() - start;

        // Iterative execution time
        start = System.nanoTime();
        fibonacciIterative(n);
        long iterativeTime = System.nanoTime() - start;

        // Print execution times
        System.out.println("Recursive Fibonacci Time: " + recursiveTime + " ns");
        System.out.println("Iterative Fibonacci Time: " + iterativeTime + " ns");
    }
}


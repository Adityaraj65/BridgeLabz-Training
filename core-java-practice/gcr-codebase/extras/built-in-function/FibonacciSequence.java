import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        printFibonacci(terms);

        sc.close();
    }

    // Function to calculate and print Fibonacci sequence
    public static void printFibonacci(int terms) {

        int first = 0;
        int second = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}


import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Check for natural number
        if (num < 0) {
            System.out.println("Please enter a natural number.");
        } else {
            long factorial = 1;

            // Factorial using for loop
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        sc.close();
    }
}


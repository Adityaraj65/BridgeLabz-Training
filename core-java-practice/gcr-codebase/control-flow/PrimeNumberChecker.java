import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();

        boolean isPrime = true;

        // Prime number check is valid only for numbers greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {

            // Check divisibility from 2 up to number - 1
            for (int i = 2; i < number; i++) {

                // If number is divisible by any value other than 1 and itself
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result based on isPrime value
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        sc.close();
    }
}

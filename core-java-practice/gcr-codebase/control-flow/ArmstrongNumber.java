import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Loop continues until all digits of the number are processed
        while (originalNumber != 0) {

            // Extract the last digit
            int digit = originalNumber % 10;

            // Find cube of the digit and add to sum
            sum = sum + (digit * digit * digit);

            // Remove the last digit from the number
            originalNumber = originalNumber / 10;
        }

        // Compare the calculated sum with the original number
        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}

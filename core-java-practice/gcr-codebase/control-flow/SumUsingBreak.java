import java.util.Scanner;

public class SumUsingBreak {
    public static void main(String[] args) {
         // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        // Variable to store the total sum
        double total = 0.0;
        // Infinite loop to continuously take input
        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            // If the user enters 0 or negative number ,loop will stop
            if (num <= 0) {
                break;
            }
           // add the entered number to total.
            total += num;
        }

        System.out.println("Total sum is: " + total);

        sc.close();
    }
}

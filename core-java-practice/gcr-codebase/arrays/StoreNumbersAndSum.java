import java.util.Scanner;

public class StoreNumbersAndSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array to store maximum 10 values
        double[] numbers = new double[10];

        // Variable to store total sum
        double total = 0.0;

        // Index to track array position
        int index = 0;

        // Read values until user enters 0/negative or array limit is reached
        while (true) {

            double input = sc.nextDouble();

            // Stop if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Stop if array is full
            if (index == 10) {
                break;
            }

            // Store value in array
            numbers[index] = input;
            index++;
        }

        // Display all stored numbers and calculate sum
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total = total + numbers[i];
        }

        // Display total sum
        System.out.println("Sum: " + total);

        sc.close();
    }
}


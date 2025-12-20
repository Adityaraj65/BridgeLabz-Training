import java.util.Scanner;

public class FizzBuzzArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        String[] results = new String[number + 1];

        // Store FizzBuzz results
        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display results with position
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}


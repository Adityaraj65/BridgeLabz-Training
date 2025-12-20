import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();

        int count = 0;

        // Loop continues until all digits are removed
        while (number != 0) {

            // Remove the last digit
            number = number / 10;

            // Increase digit count
            count++;
        }

        System.out.println(count);

        sc.close();
    }
}


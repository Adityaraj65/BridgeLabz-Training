import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // asking user to give input.
        System.out.println("Enter number: ");
        int number = sc.nextInt();
       // variable to store the greatest factor
        int greatestFactor = 1;

        // Start checking from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {

            // If i divides the number completely, it is a factor
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("greatest factor is "+greatestFactor);

        sc.close();
    }
}


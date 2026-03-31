import java.util.Scanner;

public class GreatestFactorUsingWhile {

    public static void main(String[] args) {
        //scanner object to take input from user 
        Scanner sc = new Scanner(System.in);
        //taking input from user.
        System.out.println("enter a number ");
        int number = sc.nextInt();

        int greatestFactor = 1;

        int counter = number - 1;

        // Keep checking from number - 1 down to 1
        while (counter >= 1) {

            // If counter divides the number completely, it is a factor
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }

            counter--;
        }
        System.out.println("greatest factor is "+greatestFactor);

        sc.close();
    }
}

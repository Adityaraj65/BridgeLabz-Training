import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        // create a scanner object 
        Scanner sc = new Scanner(System.in);
        //get input number .
        System.out.println("Enter a number ");
        int number = sc.nextInt();
        // assigning inital value of number to original number 
        int originalNumber = number;
        int sum = 0;

        // Calculate sum of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + digit;
            originalNumber = originalNumber / 10;
        }

        // Check divisibility by sum of digits
        if (sum != 0 && number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        sc.close();
    }
}


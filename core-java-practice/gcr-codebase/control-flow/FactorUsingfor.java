import java.util.Scanner;
public class FactorUsingfor {

    public static void main(String[] args) {
        //create scanner object
        Scanner sc = new Scanner(System.in);
        // taking positive integer as input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        //cehck if number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {

            System.out.println("Factors of " + number + " are:");
            //factor of a number using for loop
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}


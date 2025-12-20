import java.util.Scanner;

public class AbundantNumber {

    public static void main(String[] args) {
        // create scanner object 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = sc.nextInt();
        // taking variable sum
        int sum = 0;

        // Find sum of all proper divisors
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Compare divisor sum with the number
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        sc.close();
    }
}

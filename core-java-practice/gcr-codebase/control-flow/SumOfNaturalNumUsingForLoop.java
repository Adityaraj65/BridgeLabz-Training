import java.util.Scanner;

public class SumOfNaturalNumUsingForLoop {
    public static void main(String[] args) {
            // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check whether the number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {

            //using loop
            int sumUsingLoop = 0;
            
            
            for(int i=0;i<=n;i++) {
                sumUsingLoop += i;
            }

            // using formula 
            int sumUsingFormula = n * (n + 1) / 2;

           
            // Compare both results
            if (sumUsingLoop == sumUsingFormula) {
                System.out.println("Result is correct. Both computations match and sum is "+sumUsingLoop);
            } else {
                System.out.println("Result is incorrect. Both computations do not match and the sum using loop is "+sumUsingLoop+"sum using formula is "+sumUsingFormula);
            }
        }

        // Close the scanner
        sc.close();
    }    
}

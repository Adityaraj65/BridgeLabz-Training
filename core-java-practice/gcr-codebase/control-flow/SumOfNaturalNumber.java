import java.util.Scanner;

public class SumOfNaturalNumber{
    public static void main(String[] args) {
        // create a scanner as object
        Scanner sc = new Scanner(System.in);
        // get input value n 
        int n = sc.nextInt();
       // checking if input n is natural number 
        if (n >= 0) {
            //calculating sum of n natural number
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        sc.close();
    }
}


import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking positive integer number 
        System.out.println("enter a positive number less 100");
        int number =sc.nextInt();

         // Proceed only if the number is positive and less than 100
        if (number > 0 && number < 100) {

            // Loop runs backward from 100 to 1
            for (int i = 100; i >= 1; i--) {

                // If i is a multiple of the given number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}

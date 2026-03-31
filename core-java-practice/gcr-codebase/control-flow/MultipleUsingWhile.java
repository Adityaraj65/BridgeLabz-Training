import java.util.Scanner;

public class MultipleUsingWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // Proceed only if the number is positive and less than 100
        if (number > 0 && number < 100) {

            int counter = 100;

            // Loop runs backward from 100 to 1
            while (counter > 1) {

                // Check if counter is a multiple of the given number
                if (counter % number == 0) {
                    System.out.println(counter);
                }

                counter--;
            }
        }

        sc.close();
    }
}


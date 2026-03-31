import java.util.Scanner;

public class OddEvenArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        int evenIndex = 0;
        int oddIndex = 0;

        // Separate odd and even numbers
        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.println(oddNumbers[i]);
        }

        // Print even numbers
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.println(evenNumbers[i]);
        }

        sc.close();
    }
}


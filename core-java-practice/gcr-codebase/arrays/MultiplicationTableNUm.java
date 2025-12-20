import java.util.Scanner;

public class MultiplicationTableNUm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        int number = sc.nextInt();

        // Array to store multiplication results from 1 to 10
        int[] multiplicationTable = new int[10];

        // Calculate and store table values
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Display the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        sc.close();
    }
}


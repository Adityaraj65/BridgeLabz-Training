import java.util.Scanner;

public class PowerOfNumberUsingFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;

        // Proceed only if both inputs are positive
        if (number > 0 && power > 0) {

            // Multiply number by itself 'power' times
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            System.out.println(result);
        }

        sc.close();
    }
}

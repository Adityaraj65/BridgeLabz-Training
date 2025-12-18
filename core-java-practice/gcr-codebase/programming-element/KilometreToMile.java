import java.util.Scanner;

public class KilometreToMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometres: ");
        double kilometres = sc.nextDouble();

        double miles = kilometres * 0.621371;

        System.out.println("the total mile is " + miles+"for the given"+kilometres);
    }
}

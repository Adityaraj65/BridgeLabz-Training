import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        // Convert degrees to radians
        double angleInRadians = Math.toRadians(angleInDegrees);

        double sin = Math.sin(angleInRadians);
        double cos = Math.cos(angleInRadians);
        double tan = Math.tan(angleInRadians);

        // Store results in array
        return new double[] { sin, cos, tan };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sine(" + angle + ")     = " + result[0]);
        System.out.println("Cosine(" + angle + ")   = " + result[1]);
        System.out.println("Tangent(" + angle + ")  = " + result[2]);

        sc.close();
    }
}

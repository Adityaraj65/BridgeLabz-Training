import java.util.Scanner;

public class BodyMassIndexCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input weight in kilograms
        double weightInKg = sc.nextDouble();

        // Input height in centimeters
        double heightInCm = sc.nextDouble();

        // Convert height from centimeters to meters
        double heightInMeters = heightInCm / 100;

        // Calculate BMI 
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Variable to store weight status
        String weightStatus;

        // Determine BMI category
        if (bmi <= 18.4) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            weightStatus = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }

        // Display BMI and status
        System.out.println("BMI: " + bmi);
        System.out.println("Status: " + weightStatus);

        sc.close();
    }
}

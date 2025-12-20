import java.util.Scanner;

public class BmiFitnessTracker {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // enter weight in kg
        System.out.print("Enter weight (in kilograms): ");
        double weightInKg = sc.nextDouble();


        // Ask user to choose height unit
        System.out.println("\nSelect height unit:");
        System.out.println("1. Meters");
        System.out.println("2. Centimeters");
        System.out.println("3. Feet & Inches");

        int unitChoice = sc.nextInt();

        double heightInMeters = 0.0;

        // Convert selected unit to meters
        if (unitChoice == 1) {

            // Height already in meters
            System.out.print("Enter height in meters: ");
            heightInMeters = sc.nextDouble();

        } else if (unitChoice == 2) {

            // Convert cm to meters
            System.out.print("Enter height in centimeters: ");
            double heightInCm = sc.nextDouble();
            heightInMeters = heightInCm / 100;

        } else if (unitChoice == 3) {

            // Convert feet & inches to meters
            System.out.print("Enter height in feet: ");
            int feet = sc.nextInt();

            System.out.print("Enter remaining inches: ");
            int inches = sc.nextInt();

            double totalInches = (feet * 12) + inches;
            heightInMeters = totalInches * 0.0254;

        } else {

            // Invalid unit choice
            System.out.println("Invalid height unit selection.");
            sc.close();
            return;
        }

        // Calculate BMI using formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Display BMI value
        System.out.println("Your BMI is: " + bmi);

        // Determine BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }

        
        sc.close();
    }
}

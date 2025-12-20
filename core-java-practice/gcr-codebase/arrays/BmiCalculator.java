import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {

        // Creating scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking input for number of persons
        int numberOfPersons = sc.nextInt();

        // Arrays to store height, weight, BMI and status
        double[] heights = new double[numberOfPersons];
        double[] weights = new double[numberOfPersons];
        double[] bmiValues = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Taking height and weight input for each person
        for (int i = 0; i < numberOfPersons; i++) {

            // Taking height in centimeters
            heights[i] = sc.nextDouble();

            // Taking weight in kilograms
            weights[i] = sc.nextDouble();
        }

        // Calculating BMI and determining status
        for (int i = 0; i < numberOfPersons; i++) {

            // Converting height from cm to meters
            double heightInMeters = heights[i] / 100;

            // Calculating BMI
            bmiValues[i] = weights[i] / (heightInMeters * heightInMeters);

            // Finding weight status based on BMI value
            if (bmiValues[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmiValues[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying height, weight, BMI and status of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + heights[i]);
            System.out.println("Weight: " + weights[i]);
            System.out.println("BMI: " + bmiValues[i]);
            System.out.println("Status: " + weightStatus[i]);
        }

        sc.close();
    }
}

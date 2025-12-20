import java.util.Scanner;

public class BmiCalculatorUsing2DArray {

    public static void main(String[] args) {

        // Creating scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking input for number of persons
        int numberOfPersons = sc.nextInt();

        // 2D array to store height, weight and BMI
        double[][] personData = new double[numberOfPersons][3];

        // Array to store weight status
        String[] weightStatus = new String[numberOfPersons];

        // Taking height and weight input
        for (int i = 0; i < numberOfPersons; i++) {

            // Taking height in centimeters
            double height = sc.nextDouble();

            // Taking weight in kilograms
            double weight = sc.nextDouble();

            // Check for invalid input
            if (height <= 0 || weight <= 0) {
                System.out.println("Enter positive values");
                i--;
                continue;
            }

            personData[i][0] = height;
            personData[i][1] = weight;
        }

        // Calculating BMI and weight status
        for (int i = 0; i < numberOfPersons; i++) {

            // Convert height from cm to meters
            double heightInMeters = personData[i][0] / 100;

            // Calculate BMI
            double bmi = personData[i][1] / (heightInMeters * heightInMeters);
            personData[i][2] = bmi;

            // Decide weight status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display details of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + personData[i][0]);
            System.out.println("Weight: " + personData[i][1]);
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        sc.close();
    }
}

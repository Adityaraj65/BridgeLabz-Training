import java.util.Scanner;

public class BMICalculation {

    // Method to calculate BMI and Status for each person
    static String[][] calculateBMIAndStatus(int[][] heightWeightData) {

        String[][] bmiResult = new String[heightWeightData.length][4];

        for (int i = 0; i < heightWeightData.length; i++) {

            int weightKg = heightWeightData[i][0];
            int heightCm = heightWeightData[i][1];

            // Convert height from cm to meters
            double heightMeter = heightCm / 100.0;

            // BMI formula
            double bmiValue = weightKg / (heightMeter * heightMeter);

            // Round BMI to 2 decimal places
            bmiValue = Math.round(bmiValue * 100.0) / 100.0;

            String bmiStatus;

            // Determine BMI status
            if (bmiValue <= 18.4) {
                bmiStatus = "Underweight";
            } else if (bmiValue <= 24.9) {
                bmiStatus = "Normal";
            } else if (bmiValue <= 39.9) {
                bmiStatus = "Overweight";
            } else {
                bmiStatus = "Obese";
            }

            // Store values in 2D String array
            bmiResult[i][0] = String.valueOf(heightCm);
            bmiResult[i][1] = String.valueOf(weightKg);
            bmiResult[i][2] = String.valueOf(bmiValue);
            bmiResult[i][3] = bmiStatus;
        }

        return bmiResult;
    }



    // Method to display BMI table
    static void displayBMITable(String[][] bmiTable) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < bmiTable.length; i++) {
            System.out.println(
                    bmiTable[i][0] + "\t\t" +
                    bmiTable[i][1] + "\t\t" +
                    bmiTable[i][2] + "\t\t" +
                    bmiTable[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // int numberOfPersons = 10;
        int[][] heightWeightData = new int[10][2];

        // Taking user input
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            heightWeightData[i][0] = scanner.nextInt();

            System.out.print("Enter height (cm): ");
            heightWeightData[i][1] = scanner.nextInt();
        }

        // Prepare BMI table
        String[][] bmiTable = calculateBMIAndStatus(heightWeightData);

        // Display result
        displayBMITable(bmiTable);

        scanner.close();
    }
}


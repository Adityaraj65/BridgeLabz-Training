import java.util.Scanner;

public class StudentScoreCard {

    // a. Generate random 2-digit PCM scores for all students
    static int[][] generateStudentScores(int numberOfStudents) {

        int[][] scores = new int[numberOfStudents][3]; // P, C, M

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10; // Physics
            scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int) (Math.random() * 90) + 10; // Maths
        }
        return scores;
    }

    // b. Calculate total, average, percentage (rounded to 2 digits)
    static double[][] calculateTotalsAndPercentage(int[][] scores) {

        double[][] result = new double[scores.length][3]; // Total, Avg, %

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // c. Calculate grade based on percentage
    static String[][] calculateGrades(double[][] percentageData) {

        String[][] grades = new String[percentageData.length][1];

        for (int i = 0; i < percentageData.length; i++) {
            double percentage = percentageData[i][2];

            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R";
            }
        }
        return grades;
    }

    // d. Display scorecard in tabular format
    static void displayScoreCard(
            int[][] scores,
            double[][] calculations,
            String[][] grades) {

        System.out.println(
                "\nID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println(
                "---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int) calculations[i][0] + "\t" +
                    calculations[i][1] + "\t" +
                    calculations[i][2] + "\t" +
                    grades[i][0]
            );
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[][] scores = generateStudentScores(numberOfStudents);
        double[][] calculations = calculateTotalsAndPercentage(scores);
        String[][] grades = calculateGrades(calculations);

        displayScoreCard(scores, calculations, grades);

        scanner.close();
    }
}

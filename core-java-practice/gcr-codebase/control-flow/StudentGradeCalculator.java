import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.println("Enter physics marks");
        double physicsMarks = sc.nextDouble();
        System.out.println("Enter chemistry marks");
        double chemistryMarks = sc.nextDouble();
        System.out.println("enter math marks:");
        double mathsMarks = sc.nextDouble();

        // Calculate total and average percentage
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double averagePercentage = totalMarks / 3;

        // Variables to store grade and remarks
        String grade;
        String remarks;

        // Decide grade and remarks based on percentage
        if (averagePercentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (averagePercentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (averagePercentage >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (averagePercentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (averagePercentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display final result
        System.out.println("Average Marks: " + averagePercentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}

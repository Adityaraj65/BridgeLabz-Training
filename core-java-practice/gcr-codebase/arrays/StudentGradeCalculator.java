import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        // Creating scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking input for number of students
        int numberOfStudents = sc.nextInt();

        // Arrays to store marks, percentage and grade
        double[][] marks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Taking marks input for each student
        for (int i = 0; i < numberOfStudents; i++) {

            // Taking physics marks
            double physics = sc.nextDouble();

            // Taking chemistry marks
            double chemistry = sc.nextDouble();

            // Taking maths marks
            double maths = sc.nextDouble();

            // Check for invalid marks
            if (physics < 0 || chemistry < 0 || maths < 0) {
                System.out.println("Enter positive marks only");
                i--;
                continue;
            }

            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;
        }

        // Calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = totalMarks / 3;
            percentages[i] = percentage;

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display marks, percentage and grade of each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }

        sc.close();
    }
}


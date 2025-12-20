import java.util.Scanner;

public class StudentGradeUsing2DArray {

    public static void main(String[] args) {

        // Creating scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking input for number of students
        int numberOfStudents = sc.nextInt();

        // 2D array to store marks: physics, chemistry, maths
        double[][] marks = new double[numberOfStudents][3];

        // Arrays to store percentage and grade
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Taking marks input for each student
        for (int i = 0; i < numberOfStudents; i++) {

            double physics = sc.nextDouble();
            double chemistry = sc.nextDouble();
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
            percentages[i] = totalMarks / 3;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display result of each student
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

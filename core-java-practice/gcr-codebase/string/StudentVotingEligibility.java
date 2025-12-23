import java.util.Scanner;

public class StudentVotingEligibility {

    // Generate random 2-digit ages for students
    static int[] generateStudentAges(int numberOfStudents) {

        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            // Generates random age between 10 and 99
            ages[i] = (int) (Math.random() * 90) + 10;
        }
        return ages;
    }

    // Check voting eligibility and return 2D array
    static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Display result in tabular format
    static void displayVotingTable(String[][] table) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[] studentAges = generateStudentAges(numberOfStudents);
        String[][] votingResult = checkVotingEligibility(studentAges);

        displayVotingTable(votingResult);

        scanner.close();
    }
}

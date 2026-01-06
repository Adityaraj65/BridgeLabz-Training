// Handles quiz grading logic
class QuizGrader {

    // Compares answers and returns total score
    public int calculateScore(String[] correct, String[] student) {

        int score = 0;

        for (int i = 0; i < correct.length; i++) {

            // Case-insensitive comparison
            if (correct[i].equalsIgnoreCase(student[i])) {
                score++;
            }
        }
        return score;
    }

    // Prints feedback for each question
    public void printFeedback(String[] correct, String[] student) {

        for (int i = 0; i < correct.length; i++) {

            if (correct[i].equalsIgnoreCase(student[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }
    }
}

// Main application class
public class EduQuizApp {

    public static void main(String[] args) {

        // Correct answers for the quiz
        String[] correctAnswers = {
                "A", "B", "C", "D", "A",
                "C", "B", "D", "A", "C"
        };

        // Student submitted answers
        String[] studentAnswers = {
                "a", "b", "c", "d", "b",
                "c", "b", "d", "a", "d"
        };

        QuizGrader grader = new QuizGrader();

        // Show per-question feedback
        grader.printFeedback(correctAnswers, studentAnswers);

        // Calculate total score
        int score = grader.calculateScore(correctAnswers, studentAnswers);

        // Calculate percentage
        double percentage = (score / (double) correctAnswers.length) * 100;

        System.out.println("\nScore: " + score + " / " + correctAnswers.length);
        System.out.println("Percentage: " + percentage + "%");

        // Pass / Fail logic
        if (percentage >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}


import java.util.ArrayList;
import java.util.List;


class InvalidQuizSubmissionException extends Exception {

    InvalidQuizSubmissionException(String message) {
        super(message); // pass message to parent Exception class
    }
}


//  This class contains all quiz-related logic:
class QuizProcessor {


//     List to store scores of MULTIPLE users

    List<Integer> scoreList = new ArrayList<>();

    /*
     * METHOD: calculateScore
     * - Compares user answers with correct answers
     * - Validates length
     * - Returns score
     */
    int calculateScore(String[] correctAnswers, String[] userAnswers)
            throws InvalidQuizSubmissionException {

        /*
         * VALIDATION STEP
         * If lengths do not match, quiz submission is invalid
         */
        if (correctAnswers.length != userAnswers.length) {
            throw new InvalidQuizSubmissionException(
                    "Number of answers does not match the quiz questions");
        }

        int score = 0; // local variable to store score

        for (int i = 0; i < correctAnswers.length; i++) {

            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++; // correct answer → increase score
            }
        }

        /*
         * Store score in list for record of multiple users
         */
        scoreList.add(score);

        return score;
    }


//      METHOD: getGrade

    String getGrade(int score, int totalQuestions) {

        int percentage = (score * 100) / totalQuestions;

        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }

//   METHOD: displayAllScores

    void displayAllScores() {

        System.out.println("All User Scores:");

        for (Integer s : scoreList) {
            System.out.println(s);
        }
    }
}

//main class
public class OnlineQuizPlatform {

    public static void main(String[] args) {

        QuizProcessor processor = new QuizProcessor();


        String[] correctAnswers = {"A", "C", "B", "D", "A"};

        /*
         * User answers stored in array
         */
        String[] user1Answers = {"A", "C", "B", "D", "A"};
        String[] user2Answers = {"A", "B", "B", "D", "C"};

        try {
            // Process first user
            int score1 = processor.calculateScore(correctAnswers, user1Answers);
            System.out.println("User 1 Score: " + score1);
            System.out.println("User 1 Grade: " +
                    processor.getGrade(score1, correctAnswers.length));

            // Process second user
            int score2 = processor.calculateScore(correctAnswers, user2Answers);
            System.out.println("User 2 Score: " + score2);
            System.out.println("User 2 Grade: " +
                    processor.getGrade(score2, correctAnswers.length));
        } catch (InvalidQuizSubmissionException e) {
            // Handles length mismatch safely
            System.out.println("Error: " + e.getMessage());
        }

        // Display scores of all users
        processor.displayAllScores();
    }
}


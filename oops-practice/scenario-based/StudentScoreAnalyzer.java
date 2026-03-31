// Custom exception for invalid scores
class InvalidScoreException extends Exception {

    public InvalidScoreException(String message) {
        super(message);
    }
}

// Main analyzer class
public class StudentScoreAnalyzer {

    // Calculates average score
    static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // Finds highest score
    static int findMax(int[] scores) {
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    // Finds lowest score
    static int findMin(int[] scores) {
        int min = scores[0];
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    // Validates scores range
    static void validateScores(int[] scores) throws InvalidScoreException {
        for (int score : scores) {
            if (score < 0 || score > 100) {
                throw new InvalidScoreException("Invalid score found: " + score);
            }
        }
    }

    public static void main(String[] args) {

        int[] scores = {78, 85, 92, 66, 88};

        try {
            // Validate before processing
            validateScores(scores);

            System.out.println("Average Score : " + calculateAverage(scores));
            System.out.println("Highest Score : " + findMax(scores));
            System.out.println("Lowest Score  : " + findMin(scores));

        } catch (InvalidScoreException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

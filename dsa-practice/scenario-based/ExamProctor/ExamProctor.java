package ExamProctor;

import java.util.*;

class ExamProctor {

    // Stack to track question navigation
    private Stack<Integer> navigationStack = new Stack<>();

    // Map to store answers: questionId -> answer
    private Map<Integer, String> answers = new HashMap<>();

    // Correct answers (mock data)
    private Map<Integer, String> correctAnswers = new HashMap<>();

    public ExamProctor() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
    }

    // Navigate to a question
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Go back to previous question
    public void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return;
        }
        int lastQuestion = navigationStack.pop();
        System.out.println("Back from Question: " + lastQuestion);
    }

    // Store or update answer
    public void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Q" + questionId);
    }

    // Function to calculate score
    public int calculateScore() {
        int score = 0;

        for (int qId : correctAnswers.keySet()) {
            if (correctAnswers.get(qId)
                    .equalsIgnoreCase(answers.getOrDefault(qId, ""))) {
                score++;
            }
        }
        return score;
    }

    // Submit exam
    public void submitExam() {
        int finalScore = calculateScore();
        System.out.println("Exam submitted!");
        System.out.println("Final Score: " + finalScore);
    }
}


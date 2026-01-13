package ExaminationSystem;

public class ObjectiveEvaluation implements EvaluationStrategy {

    @Override
    public int evaluate(Exam exam, Student student) {
        int score = 0;

        // Check each question
        for (Question q : exam.questions) {
            String submittedAnswer = student.answers.get(q.id);

            // If answer matches, give marks
            if (q.correctAnswer.equals(submittedAnswer)) {
                score += q.marks;
            }
        }
        return score;
    }
}


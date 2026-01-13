package ExaminationSystem;

public class DescriptiveEvaluation implements EvaluationStrategy {

    @Override
    public int evaluate(Exam exam, Student student) {
        // Normally descriptive answers are checked manually
        // Here we give fixed marks for demo purpose
        return student.answers.size() * 5;
    }
}


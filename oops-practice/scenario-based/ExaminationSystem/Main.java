package ExaminationSystem;

public class Main {
    public static void main(String[] args) {

        // Create exam
        Exam javaExam = new Exam("Java Basics");

        // Add questions
        javaExam.addQuestion(new Question(1, "What is JVM?", "Java Virtual Machine", 10));
        javaExam.addQuestion(new Question(2, "What is OOP?", "Object Oriented Programming", 10));

        // Create student
        Student aditya = new Student(101, "Aditya");

        try {
            // Check if exam is active
            if (!javaExam.isActive) {
                throw new ExamTimeExpiredException("Exam time is over!");
            }

            // Student submits answers
            aditya.submitAnswer(1, "Java Virtual Machine");
            aditya.submitAnswer(2, "Object Oriented Programming");

            // Choose evaluation type (polymorphism)
            EvaluationStrategy evaluation = new ObjectiveEvaluation();

            int result = evaluation.evaluate(javaExam, aditya);

            System.out.println("Final Score: " + result);

        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}

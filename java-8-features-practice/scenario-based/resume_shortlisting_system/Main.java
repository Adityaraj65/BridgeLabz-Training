package resume_shortlisting_system;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        ResumeUtil util = new ResumeUtil();

        // Required skills for the job
        Set<String> requiredSkills = new HashSet<>();
        requiredSkills.add("Java");
        requiredSkills.add("Spring");
        requiredSkills.add("SQL");

        // Creating resumes
        Resume r1 = new Resume(
                "Aman",
                new HashSet<>(Arrays.asList("Java", "Spring", "Hibernate"))
        );

        Resume r2 = new Resume(
                "Ravi",
                new HashSet<>(Arrays.asList("Java", "SQL"))
        );

        Resume r3 = new Resume(
                "Shyam",
                new HashSet<>(Arrays.asList("Python", "Django"))
        );

        // Adding resumes
        util.addResume(r1);
        util.addResume(r2);
        util.addResume(r3);

        try {
            // Shortlisting and sorting resumes
            List<Resume> shortlisted = util.matchCount(requiredSkills);

            System.out.println("\n--- Shortlisted Resumes ---");
            for (Resume r : shortlisted) {
                System.out.println(r);
            }

        } catch (InvalidResumeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

package generics;

import java.util.ArrayList;
import java.util.List;

// Base class for all job roles
abstract class JobRole {
    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    // Each role has its own screening logic
    public abstract String getRequiredSkills();
}

// Software engineer role
class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }

    public String getRequiredSkills() {
        return "Java, DSA, OOPs";
    }
}

// Data scientist role
class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }

    public String getRequiredSkills() {
        return "Python, ML, Statistics";
    }
}

// Product manager role
class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

    public String getRequiredSkills() {
        return "Communication, Strategy, Analytics";
    }
}

// Generic Resume class restricted to JobRole
class Resume<T extends JobRole> {

    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public String getResumeDetails() {
        return "Candidate: " + candidateName +
                ", Role: " + jobRole.getRoleName() +
                ", Skills: " + jobRole.getRequiredSkills();
    }
}

// Utility class for screening operations
class ScreeningUtils {

    // Generic method to screen a resume
    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println(resume.getResumeDetails());
    }

    // Wildcard method to handle multiple job roles
    public static void screenAllRoles(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening role: " + role.getRoleName() +
                    ", Required skills: " + role.getRequiredSkills());
        }
    }
}

// Main class
public class ResumeScreeningApp {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> seResume =
                new Resume<>("Aditya", new SoftwareEngineer());

        Resume<DataScientist> dsResume =
                new Resume<>("Rahul", new DataScientist());

        Resume<ProductManager> pmResume =
                new Resume<>("Sneha", new ProductManager());

        ScreeningUtils.screenResume(seResume);
        ScreeningUtils.screenResume(dsResume);
        ScreeningUtils.screenResume(pmResume);

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningUtils.screenAllRoles(roles);
    }
}

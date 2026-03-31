package factory_robot_hazard_analyzer;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RobotHazardAuditor auditor = new RobotHazardAuditor();
        try {
            // Read arm precision
            System.out.println("Enter Arm Precision (0.0 - 1.0):");
            double armPrecision = sc.nextDouble();
            // Read worker density
            System.out.println("Enter Worker Density (1 - 20):");
            int workerDensity = sc.nextInt();
            sc.nextLine(); // consume newline
            // Read machinery state (worn,faulty,critical)
            System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
            String machineryState = sc.nextLine();
            // Calculate hazard risk
            double risk = auditor.CalculateHazardRisk(armPrecision, workerDensity, machineryState);
            // Print result
            System.out.println("Robot Hazard Risk Score: " + risk);
        } catch (RobotSafetyException e) {
            // Display exception message
            System.out.println(e.getMessage());
        }
    }
}


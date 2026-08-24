package scenarioBased.FactoryRobotHazardAnalyzer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		RobotHazardAuditor rh=new RobotHazardAuditor();
		
		System.out.println("Enter Arm Precision (0.0 - 1.0): ");
		double armPrecision=sc.nextDouble();
		System.out.println("Enter Worker Density (1 - 20):");
		int workerDensity=sc.nextInt();
		System.out.println("Enter Machinery State (Worn/Faulty/Critical): ");
		String machinerState=sc.next();
		try {
			System.out.println("Robot Hazard Risk Score: "+rh.CalculateHazardRisk(armPrecision, workerDensity, machinerState));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}

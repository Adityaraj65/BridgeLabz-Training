import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays to store employee details
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonusAmounts = new double[10];
        double[] newSalaries = new double[10];

        // Variables to store totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Taking input for 10 employees
        for (int i = 0; i < 10; i++) {

            double salary = sc.nextDouble();
            double serviceYears = sc.nextDouble();

            // checking if input is correct
            if (salary <= 0 || serviceYears < 0) {
                System.out.println("Invalid input, enter again");
                i--;
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = serviceYears;
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {

            double bonusRate;

            if (yearsOfService[i] > 5) {
                bonusRate = 0.05;
            } else {
                bonusRate = 0.02;
            }

            bonusAmounts[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonusAmounts[i];

            totalBonus = totalBonus + bonusAmounts[i];
            totalOldSalary = totalOldSalary + salaries[i];
            totalNewSalary = totalNewSalary + newSalaries[i];
        }

        // final results
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}

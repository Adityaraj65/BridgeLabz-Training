package employeewagecomputation;

/*
 * Presentation layer
 * Program execution starts here
 */
public class App {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmpWageBuilder wageBuilder = new EmpWageBuilder();

        // UC-8: multiple companies
        wageBuilder.addCompanyEmpWage("DMart", 20, 20, 100);
        wageBuilder.addCompanyEmpWage("Reliance", 25, 22, 110);

        // Calculate wages
        wageBuilder.computeEmpWage();

        // Display results
        System.out.println("DMart Total Wage = "
                + wageBuilder.getTotalWage("DMart"));

        System.out.println("Reliance Total Wage = "
                + wageBuilder.getTotalWage("Reliance"));
    }
}


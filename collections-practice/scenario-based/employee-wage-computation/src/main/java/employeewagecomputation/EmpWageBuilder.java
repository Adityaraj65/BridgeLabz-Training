package employeewagecomputation;

import java.util.ArrayList;
import java.util.Random;


public class EmpWageBuilder implements IEmpWageBuilder {

    // List to store multiple companies
    private ArrayList<CompanyEmpWage> companyList = new ArrayList<>();

    // Constants
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;

    @Override
    public void addCompanyEmpWage(String companyName,
                                  int wagePerHour,
                                  int maxWorkingDays,
                                  int maxWorkingHours) {

        // Regex validation
        ValidationUtil.validateCompanyName(companyName);
        ValidationUtil.validatePositiveNumber(wagePerHour, "Wage per hour");
        ValidationUtil.validatePositiveNumber(maxWorkingDays, "Working days");
        ValidationUtil.validatePositiveNumber(maxWorkingHours, "Working hours");

        CompanyEmpWage company =
                new CompanyEmpWage(companyName,
                                   wagePerHour,
                                   maxWorkingDays,
                                   maxWorkingHours);

        companyList.add(company);
    }

    @Override
    public void computeEmpWage() {

        // Calculate wage for each company
        for (CompanyEmpWage company : companyList) {
            calculateCompanyWage(company);
        }
    }

    // Core wage calculation logic
    private void calculateCompanyWage(CompanyEmpWage company) {

        int totalHours = 0;
        int totalDays = 0;

        Random random = new Random();

        // UC-6: condition based on max hours or days
        while (totalHours < company.maxWorkingHours
                && totalDays < company.maxWorkingDays) {

            totalDays++;

            int empType = random.nextInt(3);
            int empHours = 0;

            // UC-4: switch case
            switch (empType) {
                case FULL_TIME:
                    empHours = 8;
                    break;
                case PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0; // Absent
            }

            totalHours += empHours;

            // UC-12: store daily wage
            company.dailyWages.add(empHours * company.wagePerHour);
        }

        // UC-9: store total wage
        company.setTotalWage(totalHours * company.wagePerHour);
    }

    @Override
    public int getTotalWage(String companyName) {

        // UC-13: fetch total wage by company
        for (CompanyEmpWage company : companyList) {
            if (company.companyName.equals(companyName)) {
                return company.totalWage;
            }
        }
        return 0;
    }
}

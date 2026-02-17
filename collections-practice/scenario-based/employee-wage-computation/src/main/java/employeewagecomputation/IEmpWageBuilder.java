package employeewagecomputation;


public interface IEmpWageBuilder {

    // Add company details
    void addCompanyEmpWage(String companyName,
                           int wagePerHour,
                           int maxWorkingDays,
                           int maxWorkingHours);

    // Calculate wages for all companies
    void computeEmpWage();

    // Get total wage by company name
    int getTotalWage(String companyName);
}

package employeewagecomputation;

import java.util.ArrayList;
//model layer
public class CompanyEmpWage {

    public String companyName;
    public int wagePerHour;
    public int maxWorkingDays;
    public int maxWorkingHours;

    public int totalWage;

    // Stores daily wage values
    public ArrayList<Integer> dailyWages;

    public CompanyEmpWage(String companyName,
                           int wagePerHour,
                           int maxWorkingDays,
                           int maxWorkingHours) {

        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;

        this.dailyWages = new ArrayList<>();
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }
}


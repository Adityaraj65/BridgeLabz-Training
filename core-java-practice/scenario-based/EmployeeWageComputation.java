public class EmployeeWageComputation {
    //   Company Constants
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int MAX_WORKING_HOURS = 100;

    static final int ABSENT = 0;
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;

    //    UC1: Check Employee Attendance
    static int checkAttendance() {
        // 0 = Absent, 1 = Present
        return (int) (Math.random() * 2);
    }
     //UC2: Calculate Daily Wage
   
    static int calculateDailyWage() {
        int attendance = checkAttendance();
        int workHours = 0;

        if (attendance == 1) {
            workHours = FULL_DAY_HOURS;
        }

        return workHours * WAGE_PER_HOUR;
    }

    //    UC3: Part-Time Employee Hours
    
    static int getPartTimeHours() {
        return PART_TIME_HOURS;
    }

    //    UC4: Determine Working Hours using switch case
    
   
    static int getWorkingHours() {
        int employeeType = (int) (Math.random() * 3); // 0,1,2

        switch (employeeType) {
            case FULL_TIME:
                return FULL_DAY_HOURS;

            case PART_TIME:
                return PART_TIME_HOURS;

            default:
                return 0; // Absent
        }
    }

 
    //    UC5: Calculate Monthly Wage for 20 Working Days
      
    static int calculateMonthlyWage() {
        int totalHours = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            totalHours += getWorkingHours();
        }

        return totalHours * WAGE_PER_HOUR;
    }

  
    //    UC6: Calculate Monthly Wage with Max Hours or Days Limit
      
    static int calculateMonthlyWageWithLimit() {
        int totalHours = 0;
        int totalDays = 0;

        while (totalDays < WORKING_DAYS_PER_MONTH &&
               totalHours < MAX_WORKING_HOURS) {

            totalDays++;
            totalHours += getWorkingHours();
        }

        return totalHours * WAGE_PER_HOUR;
    }

    
    //    Main Method
    public static void main(String[] args) {

        // UC0: Welcome Message
        System.out.println("Welcome to Employee Wage Computation Program");

        // UC1
        int attendance = checkAttendance();
        System.out.println("Employee is " +
                (attendance == 1 ? "Present" : "Absent"));

        // UC2
        System.out.println("Daily Wage: " + calculateDailyWage());

        // UC3 
        System.out.println("Part-Time Working Hours: " + getPartTimeHours());

        // UC5
        System.out.println("Monthly Wage (20 Days): " +
                calculateMonthlyWage());

        // UC6
        System.out.println("Monthly Wage (With Limits): " +
                calculateMonthlyWageWithLimit());
    }
}

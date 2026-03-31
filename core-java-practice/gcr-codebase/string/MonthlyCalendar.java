import java.util.Scanner;

public class MonthlyCalendar {

    // Method to get the month name using month index
    static String getMonthName(int month) {

        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        return months[month - 1];
    }

    // Method to check whether a year is a leap year
    static boolean isLeapYear(int year) {

        // Leap year conditions
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }

    // Method to get number of days in a month
    static int getDaysInMonth(int month, int year) {

        int[] daysInMonths = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        // If February and leap year, return 29
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonths[month - 1];
    }

    // Method to calculate the first day of the month
    // Using Gregorian Calendar Algorithm
    static int getFirstDayOfMonth(int month, int year) {

        int d = 1; // First day of the month

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0; // 0 = Sunday, 1 = Monday, ...
    }

    // Method to display the calendar
    static void displayCalendar(int month, int year) {

        String monthName = getMonthName(month);

        int daysInMonth = getDaysInMonth(month, year);
        
        int firstDay = getFirstDayOfMonth(month, year);

        // Print header
        System.out.println("\n   " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First for-loop: print spaces for indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second for-loop: print all days of the month
        for (int day = 1; day <= daysInMonth; day++) {

            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println(); // Final line break
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar
        displayCalendar(month, year);

        scanner.close();
    }
}

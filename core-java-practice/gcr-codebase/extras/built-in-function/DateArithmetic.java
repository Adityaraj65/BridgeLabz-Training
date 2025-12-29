import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take date input from user
        System.out.print("Enter date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();

        // Convert String to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Step 2: Add 7 days
        date = date.plusDays(7);

        // Step 3: Add 1 month
        date = date.plusMonths(1);

        // Step 4: Add 2 years
        date = date.plusYears(2);

        // Step 5: Subtract 3 weeks
        date = date.minusWeeks(3);

        // Display final result
        System.out.println("Final date after calculations: " + date);

        sc.close();
    }
}


import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RohanLibraryRemainderApp {

    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Fine amount charged per late day
        int finePerDay = 5;

        // Inform user about the expected date format
        System.out.println("Enter dates in format: YYYY-MM-DD");

        // Loop to process fine calculation for 5 books
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);

            // Taking due date input from the user
            System.out.print("Enter due date: ");
            LocalDate dueDate = LocalDate.parse(sc.next());

            // Taking return date input from the user
            System.out.print("Enter return date: ");
            LocalDate returnDate = LocalDate.parse(sc.next());

            // Check if the book is returned after the due date
            if (returnDate.isAfter(dueDate)) {

                // Calculate number of late days
                long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);

                // Calculate total fine based on late days
                long fine = lateDays * finePerDay;

                // Display late information and fine amount
                System.out.println("Book returned late by " + lateDays + " days.");
                System.out.println("Fine to be paid: Rs. " + fine);

            } else {
                // If book is returned on or before due date
                System.out.println("Book returned on time. No fine.");
            }
        }

        // Message after all books are processed
        System.out.println("\nAll books processed.");
    }
}

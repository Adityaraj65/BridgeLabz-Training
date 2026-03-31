import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormatting {
    public static void main(String[] args) {
        // Step 1: Get the current date (without time)
        LocalDate currentDate=LocalDate.now();
        // Step 2: Create different formatters
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3=DateTimeFormatter.ofPattern("EEE,MMM dd,yyyy");

        
        // Step 3: Format and display the date
        System.out.println("Format 1 (dd/MM/yyyy): " +
                currentDate.format(format1));

        System.out.println("Format 2 (yyyy-MM-dd): " +
                currentDate.format(format2));

        System.out.println("Format 3 (EEE, MMM dd, yyyy): " +
                currentDate.format(format3));
    }
}

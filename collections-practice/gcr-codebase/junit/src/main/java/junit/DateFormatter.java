package junit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

    // change date format
    public String formatDate(String inputDate) {
        DateTimeFormatter input = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter output = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(inputDate, input);
        return date.format(output);
    }
}

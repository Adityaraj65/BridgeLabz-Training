package functional_interfaces.date_format_utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateUtils {
    // Static method to format date in given pattern
    static String formatDate(LocalDate date, String pattern) {
        // Null check to avoid NullPointerException
        if (date == null || pattern == null) {
            return "";
        }
        // Creating formatter using provided pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        // Formatting and returning date
        return date.format(formatter);
    }
}


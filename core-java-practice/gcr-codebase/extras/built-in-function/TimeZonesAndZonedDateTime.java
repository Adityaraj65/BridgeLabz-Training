import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class TimeZonesAndZonedDateTime {
    public static void main(String[] args) {
         // Formatter for readable date-time output
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-YYY HH:mm:ss z");
        // GMT (Greenwich Mean Time)
        ZonedDateTime gmtTime=ZonedDateTime.now(ZoneId.of("GMT"));
          // IST (Indian Standard Time)
        ZonedDateTime istTime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        // PST (Pacific Standard Time)
        ZonedDateTime pstTime=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display results
        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current Time in IST: " + istTime.format(formatter));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));
    }
}

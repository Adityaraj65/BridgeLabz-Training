public class DayOfWeek {

    public static void main(String[] args) {

        // Read command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        // Adjust year based on month
        int adjustedYear = year - (14 - month) / 12;

        // Calculate intermediate value x
        int x = adjustedYear + adjustedYear / 4 - adjustedYear / 100 + adjustedYear / 400;

        // Adjust month value
        int adjustedMonth = month + 12 * ((14 - month) / 12) - 2;

        // Calculate day of week
        int dayOfWeek = (day + x + (31 * adjustedMonth) / 12) % 7;

        // Print result where 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        System.out.println(dayOfWeek);
    }
}

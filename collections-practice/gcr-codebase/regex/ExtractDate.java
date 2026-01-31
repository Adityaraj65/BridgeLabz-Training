package regex;
import java.util.Scanner;
import java.util.regex.*;
public class ExtractDate{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        // date pattern: dd/mm/yyyy
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern datePattern = Pattern.compile(regex);
        Matcher dateMatcher = datePattern.matcher(text);
        System.out.println("\nDates found:");
        while (dateMatcher.find()) {
            System.out.println(dateMatcher.group());
        }
        sc.close();
    }
}


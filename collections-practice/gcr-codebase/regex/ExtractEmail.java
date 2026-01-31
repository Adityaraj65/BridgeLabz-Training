package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void main(String[] args) {
        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Create matcher to search inside the text
        Matcher matcher = pattern.matcher(text);
        System.out.println("\nExtracted Email Addresses:");
        // find() looks for pattern ANYWHERE in the text
        while (matcher.find()) {
            // group() returns the matched email
            System.out.println(matcher.group());
        }
        // Close scanner
        sc.close();
    }
}


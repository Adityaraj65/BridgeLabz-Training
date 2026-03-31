package regex;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractLinks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        // matches http or https links
        String regex = "https?://[a-zA-Z0-9.-]+";
        Pattern linkPattern = Pattern.compile(regex);
        Matcher matcher = linkPattern.matcher(text);
        System.out.println("\nLinks found:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        sc.close();
    }
}


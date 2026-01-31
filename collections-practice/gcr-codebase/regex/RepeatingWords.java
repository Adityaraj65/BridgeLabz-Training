package regex;

import java.util.regex.*;

public class RepeatingWords {
    public static void main(String[] args) {

        String text = "This is is a repeated repeated word test.";

        // same word repeated
        String regex = "\\b(\\w+)\\s+\\1\\b";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        System.out.println("Repeated words:");
        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
}


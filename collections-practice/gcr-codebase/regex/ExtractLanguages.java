package regex;

import java.util.regex.*;

public class ExtractLanguages {
    public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        // words starting with capital letter
        String regex = "\\b[A-Z][a-zA-Z]*\\b";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        System.out.println("Languages found:");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}


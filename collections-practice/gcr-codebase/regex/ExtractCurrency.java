package regex;

import java.util.regex.*;

public class ExtractCurrency {
    public static void main(String[] args) {

        String text = "The price is $45.99, and the discount is 10.50.";

        // currency values like $45.99 or 10.50
        String regex = "\\$?\\d+(\\.\\d{2})?";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        System.out.println("Currency values:");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}


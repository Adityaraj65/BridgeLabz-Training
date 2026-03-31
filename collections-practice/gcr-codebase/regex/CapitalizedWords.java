package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take sentence from user
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        // regex for words starting with capital letter
        String regex = "\\b[A-Z][a-zA-Z]*\\b";
        Pattern wordPattern = Pattern.compile(regex);
        Matcher wordMatcher = wordPattern.matcher(sentence);
        System.out.println("\nCapitalized words found:");
        // search whole sentence
        while (wordMatcher.find()) {
            System.out.println(wordMatcher.group());
        }
        sc.close();
    }
}


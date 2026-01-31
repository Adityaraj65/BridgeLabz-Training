package regex;

import java.util.Scanner;

public class CensorBadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = sc.nextLine();
        // bad words list
        // regex uses | as or operator
        String regex = "damn|stupid";
        // replace bad words with ****
        String cleanText = sentence.replaceAll(regex, "****");
        System.out.println("\nCensored sentence:");
        System.out.println(cleanText);
        sc.close();
    }
}


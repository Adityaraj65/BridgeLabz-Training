package regex;

import java.util.Scanner;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        //create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        // replace multiple spaces with one space
        String result = text.replaceAll("\\s+", " ");
        System.out.println("\nFormatted text:");
        System.out.println(result);
        sc.close();
    }
}

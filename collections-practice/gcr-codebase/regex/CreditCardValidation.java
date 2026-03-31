package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CreditCardValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String card = sc.nextLine().trim();
        // Visa (4...) or MasterCard (5...), total 16 digits
        String regex = "^(4\\d{15}|5\\d{15})$";
        if (Pattern.matches(regex, card)) {
            System.out.println("valid credit card number");
        } else {
            System.out.println("Invalid credit card number");
        }
        sc.close();
    }
}


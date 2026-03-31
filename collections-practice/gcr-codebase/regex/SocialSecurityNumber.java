package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SocialSecurityNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SSN: ");
        String ssn = sc.nextLine().trim();

        // SSN format: 123-45-6789
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        if (Pattern.matches(regex, ssn)) {
            System.out.println("VALID SSN");
        } else {
            System.out.println("INVALID SSN");
        }

        sc.close();
    }
}


package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IPValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP address: ");
        String ip = sc.nextLine().trim();
        // IPv4 validation regex
        String regex = "^((25[0-5]|2[0-4]\\d|1?\\d?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1?\\d?\\d)$";
        if (Pattern.matches(regex, ip)) {
            System.out.println("Valid IP address");
        } else {
            System.out.println("Invalid IP address");
        }
        sc.close();
    }
}


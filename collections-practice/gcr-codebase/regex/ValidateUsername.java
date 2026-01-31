package regex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class ValidateUsername {
    public static void main(String[] args) {
        //create scanner object to take input
        Scanner sc = new Scanner(System.in);
        //Enter username
        System.out.println("Enter username");
        String userName = sc.nextLine();
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);
        // matches() checks the entire string against the regex
        if (pattern.matcher(userName).matches()) {
            System.out.println("Username is valid");
        } else {
            System.out.println("Invalid user name");
        }

        // Close scanner
        sc.close();
    }
}

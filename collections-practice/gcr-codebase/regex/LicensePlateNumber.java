package regex;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LicensePlateNumber {
    public static void main(String[] args) {
        //create scanner object
        Scanner sc =new Scanner(System.in);
        //taking license plate number as input to validate
        System.out.println("Enter license plate number to validate ");
        System.out.println("Rule:  Starts with two uppercase letters, followed by four digits.\n");
        String licenseNumber=sc.nextLine();
        //defining pattern
        String regex="^[A-z]{2}[0-9]{4}$";
        Pattern pattern= Pattern.compile(regex);
//        validating if pattern matches input
        if (pattern.matcher(licenseNumber).matches()) {
            System.out.println("License plate number is valid");
        } else {
            System.out.println("Invalid License plate number ");
        }
    }
}

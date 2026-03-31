package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HexColorCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hex Color code");
        System.out.println("rule:start with # followed by 6 hexadecimal character");

        String input=sc.nextLine();
        String regex="^[#][a-fA-F0-9]{6}$";
        Pattern pattern= Pattern.compile(regex);
        if(pattern.matcher(input).matches()){
            System.out.println("valid input");
        }else{
            System.out.println("Invalid input");
        }
    }
}

import java.util.Scanner;

public class LeapYearUsingLogicalOperators {

    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  year");
        int year = sc.nextInt();

        // Single condition using logical operators to check leap year or not 
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        sc.close();
    }
}

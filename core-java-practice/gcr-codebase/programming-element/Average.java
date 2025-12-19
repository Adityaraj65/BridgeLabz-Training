import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        // create scanner object
        Scanner sc = new Scanner(System.in);
        // get 3 input value 
        System.out.println("enter first number");
        double a =sc.nextDouble();
        System.out.println("enter second number");
        double b =sc.nextDouble();
        System.out.println("enter third number");
        double c = sc.nextDouble();
        double average= (a+b+c)/3; // calculate average of 3 number 
        System.out.println("Average of three number is "+average );
        sc.close();
    }
}

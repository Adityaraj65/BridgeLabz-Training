import java.util.Scanner;

public class CalculatorUsingSwitchCase {

    public static void main(String[] args) {
       //create scanner object
        Scanner sc = new Scanner(System.in);
        //get first input number 
        System.out.println("Enter first number ");
        double first = sc.nextDouble();
        // get second input number 
        System.out.println("Enter second number ");
        double second = sc.nextDouble();
        String op = sc.next();

        double result;

        // Perform operation based on operator
        switch (op) {

            case "+":
                result = first + second;
                System.out.println(result);
                break;

            case "-":
                result = first - second;
                System.out.println(result);
                break;

            case "*":
                result = first * second;
                System.out.println(result);
                break;

            case "/":
                result = first / second;
                System.out.println(result);
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}

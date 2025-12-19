import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);
        //get first number 
        double number1=sc.nextDouble();
        //get input second number 
        double number2=sc.nextDouble();
        // calculate addition
        double addition=number1+number2;
        // calculate subtraction
        double subtraction=number1-number2;
        // calculate multiplication
        double muliplication=number1*number2;
        // calculate division
        double division=number1/number2;
        System.out.println("The addition,subtraction,multiplicationand division value of 2 numbers "+number1+" and "+number2+" is "+addition+","+subtraction+","+muliplication+" and "+ division);
        sc.close();
    }
}

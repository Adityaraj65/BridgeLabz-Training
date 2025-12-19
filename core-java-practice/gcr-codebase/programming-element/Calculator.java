import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1=sc.nextDouble();
        double number2=sc.nextDouble();
        double addition=number1+number2;
        double subtraction=number1-number2;
        double muliplication=number1*number2;
        double division=number1/number2;
        System.out.println("The addition,subtraction,multiplicationand division value of 2 numbers "+number1+" and "+number2+" is "+addition+","+subtraction+","+muliplication+" and "+ division);
    }
}

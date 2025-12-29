import java.util.Scanner;
public class MaximumOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking user input for three number 
        System.out.println("Enter first number");
        int number1=sc.nextInt();
        System.out.println("Enter second number :");
        int number2=sc.nextInt();
        System.out.println("Enter third number");
        int number3=sc.nextInt();
        maximum(number1, number2, number3);
    }
    //method to find maximum number 
    static void maximum(int num1, int num2,int num3){
        if(num1>num2&&num1>num3){
            System.out.println("maximum number is : "+num1);
        }else if(num2>num1&&num2>3){
            System.out.println("maximum number is : "+num2);
        }else{
            System.out.println("Maximum number is : "+ num3);
        }

    }
}

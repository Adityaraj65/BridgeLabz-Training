import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);
        //get input from user 
        System.out.println("Enter a number :" );
        int number =sc.nextInt();
        //calling method to calculate factorial
        int fact=factorial(number);
        System.out.println("Factorial of number "+number+" is "+fact);
    }
    // method to find the factorial of a number 
    public static int factorial(int number){
        if(number==1||number==0){
            return 1;
        }
        
        return factorial(number-1)*number;
        
    }
}

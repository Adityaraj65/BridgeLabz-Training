import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);
        //get 3 input number
        System.out.println("enter 3 number :");
        int number1= sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        // checking which number is largest
        if(number1>number2&& number1>number3){
            System.out.println(" Is the first number the largest? YES"); // first number is the largest
        }else if(number2>number1&& number2>number3){
            System.out.println("Is the second number largest?  YES"); // second number is the largest 
        }else{
            System.out.println("Is the third number largest? Yes "); // third number is the largest 
        }
           
        sc.close();
        
    }
}

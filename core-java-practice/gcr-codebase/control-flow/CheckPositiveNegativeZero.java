import java.util.Scanner;
public class CheckPositiveNegativeZero {
    public static void main(String[] args) {
         // Create a Scanner Object
        Scanner sc= new Scanner(System.in);
         // Get input value for number
        int number =sc.nextInt();
        //check if number is positive ,negative or zero.
        if(number >0){
            System.out.println("positive"); // number is positive
        }else if(number<0){
            System.out.println("negative"); //  number is negative
        }else{
            System.out.println("zero");// number is zero
        }
        sc.close();
    }
}

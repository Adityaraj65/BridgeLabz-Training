import java.util.Scanner;
public class Divisibility {

    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);
        //Get input value for a number
        int number=sc.nextInt();
        //check if input number is divisible by 5 
        if(number%5==0){
            System.out.println("Is the number"+number+" divisible by 5?  YES");// input number is divisible by 5 
        }else{
            System.out.println("Is the number"+number+" divisible by 5?  NO");  // input number is not divisible by 5 
        }
        sc.close();
    }

}
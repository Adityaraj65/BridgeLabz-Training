import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        //creating scanner object
        Scanner sc = new Scanner(System.in);
        // taking input number 
        int number =sc.nextInt();
        //check if input number is positive integer
        if(number<0){
            System.out.println("Enter positive integer");
        }else{
            long factorial=1;
            int i=1;
         //   computing factorial using while loop
            while(i<=number){
                factorial=factorial*i;
                i++;
            }
            System.out.println("Factorial of "+ number+" is "+factorial);
        }
        sc.close();
        
    }
}

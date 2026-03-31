import java.util.Scanner;
public class CountDounWithForLoop {
    public static void main(String[] args) {
        //create scanner object
        Scanner sc = new Scanner(System.in);
        // get input value number 
        System.out.println("enter a number : ");
        int number =sc.nextInt();
        //run for loop till number become 1
        for(int i=10;i>=1;i--){
            System.out.println(number);
            number--;
        }
        sc.close();
    }
}
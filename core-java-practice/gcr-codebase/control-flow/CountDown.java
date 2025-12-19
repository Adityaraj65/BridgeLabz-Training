import java.util.Scanner;
public class CountDown {
    public static void main(String[] args) {
        //create scanner object
        Scanner sc = new Scanner(System.in);
        // get input value number 
        System.out.println("enter a number ");
        int number =sc.nextInt();
        //run while loop till number become 1
        while(number>=1){
            System.out.println(number);
            number--;
        }
        sc.close();

    }
}

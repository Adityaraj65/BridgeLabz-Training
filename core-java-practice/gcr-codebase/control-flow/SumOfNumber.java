import java.util.Scanner;
public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total=0.0;
        double num;
        // get a input number 
        System.out.println("enter a number,zero if want to stop:");
        num=sc.nextDouble();
        // loop continue until user enter zero
        while(num!=0){
            total=total+num;
            // asking you for next input.
            System.out.println("enter a number,zero if want to stop:");
            num=sc.nextDouble();
        }
        System.out.println("The total sum is: " + total);

        sc.close();
       

    }
}

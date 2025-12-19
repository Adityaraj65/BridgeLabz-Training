import java.util.Scanner;
public class AddTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // get input a 
        int a= sc.nextInt();
        //get input b
        int b=sc.nextInt();
        // Adding two number 
        int sum=a+b;
        System.out.println("sum is "+sum);
        sc.close();
    }
    
}

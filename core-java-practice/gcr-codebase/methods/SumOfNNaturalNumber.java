import java.util.Scanner;
public class SumOfNNaturalNumber {
    public static void main(String[] args) {
        // created a scanner object
        Scanner sc =new Scanner(System.in);
        // taking input from user 
        System.out.println("Enter a natural number");
        int n=sc.nextInt();
        // calling nNaturalNumberSum() method
        //  to get  the result of sum of n natural
        int result=nNaturalNumberSum(n);
        System.out.println("The sum of n Natural number is "+result);

    }
    // method to calculate sum of n natural number 
    static int nNaturalNumberSum(int n){
        int sum=0;
        while(n>=0){
            sum+=n;
            n--;
        }
        return sum;
    }
}

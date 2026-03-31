import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        //create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number=sc.nextInt();
        System.out.println("Enter the Divisor:");
        int divisor=sc.nextInt();
        // calling method findRemainderAndQuotient and storing result .
        int[] result=findRemainderAndQuotient(number,divisor);
        System.out.println("For the given number "+number+" and divisor "
        + divisor+" quotient is "+result[0]+" and remainder is "+result[1]);

    }
    // method for calculating remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient=number/divisor;
        int remainder =number%divisor;
        return new int[] {quotient,remainder};
    } 

}

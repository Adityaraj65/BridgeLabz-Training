import java.util.Scanner;

public class NumberOfChocolates {
        public static void main(String[] args) {
        //create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of chocolates :");
        int numberOfChocolates=sc.nextInt();
        System.out.println("Enter numer of student :");
        int numberOfChildren=sc.nextInt();
        // calling method find find the number of chocolates each child gets and number of remaining chocolates
        int[] result=findRemainderAndQuotient(numberOfChocolates,numberOfChildren);
        System.out.println(" each child will get "+result[0]+" chocolate and the remaining chocolate is  "+result[1]);

    }
    // method for calculating remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient=number/divisor;
        int remainder =number%divisor;
        return new int[] {quotient,remainder};
    } 
}

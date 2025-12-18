import java.util.Scanner;
public class quotient_remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1=sc.nextInt();
        int number2= sc.nextInt();
        int quotient=number1/number2;  //calculating quotient of 2 number 
        int remainder=number1%number2;  // calculating remainder of 2 number 
        System.out.println("The Quotient is "+quotient+"and Remainder is "+remainder+" of two number "+number1 +" and "+number2 );

    }
}

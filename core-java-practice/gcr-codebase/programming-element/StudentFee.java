import java.util.Scanner;
public class StudentFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fee:");
        int fee =sc.nextInt();   // taking input for student fee
        System.out.println("Enter discount percent:");
        int discountPercent=sc.nextInt();  // taking discount percent input 
        double discount=(fee*discountPercent)/100; //calculating discount
        double feeToPay=fee-discount;      // calculating total fee to pay after discount.
        System.out.println("The discount amount is INR "+discount+" and the final discounted fee is INR "+feeToPay);
    }
}

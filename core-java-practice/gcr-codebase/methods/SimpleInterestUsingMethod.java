import java.util.*;
public class SimpleInterestUsingMethod {
    public static void main(String[] args) {
        // create scanner object
        Scanner sc =new Scanner(System.in);
        // get input principal amount 
        System.out.println("Enter the principal amount :");
        double principal=sc.nextDouble();
        // get input rate 
        System.out.println("enter rate:");
        double rate =sc.nextDouble();
        // get input time
        System.out.println("Enter the time :");
        double time=sc.nextDouble();
        //calculating simple interest by call calculatedSimpleInterest method .
        double finalOutput=calculatedSimpleInterest(principal, rate, time);
        System.out.println("The simple interest is "+finalOutput+" for principal "+principal+", rate of interest "+rate+" and time "+time);

    }    
    //method to calculate simple interest .
    public static double calculatedSimpleInterest(double principal ,double rate, double time){
        double si=(principal*rate*time)/100;
        return si;
    }
}

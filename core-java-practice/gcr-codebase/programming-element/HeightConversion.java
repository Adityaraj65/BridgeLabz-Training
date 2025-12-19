import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter height:");
        double heightInCm=sc.nextDouble();  //taking height as input in centimeters 
        
        double heightInInch=heightInCm/2.54;  //converting height from centimeters to inches 
        int  heightInFeet=(int)(heightInInch/12);   //converting height from inches to feet.
        double inches=heightInInch%12;
        System.out.println("Your Height in cm is "+heightInCm+" while in feet is "+heightInFeet+" and inches is "+inches);
        sc.close();

    }
}

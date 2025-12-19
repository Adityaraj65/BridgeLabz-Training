import java.util.Scanner;
public class DistanceInYardAndMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter distance in feet");
        int distanceInFeet=sc.nextInt();       // taking distance as input in feet
        double distanceInyards=distanceInFeet/3;   //converting distance in yard
        double distanceInMiles=distanceInyards/1760;  //converting distance in miles
        System.out.println("Distance in yard is"+distanceInyards+"and distance in miles is "+distanceInMiles);
        sc.close();
    }
}



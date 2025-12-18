import java.util.Scanner;
public class DistanceInYardAndMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanceInFeet=sc.nextInt();
        double distanceInyards=distanceInFeet/3;
        double distanceInMiles=distanceInyards/1760;
        System.out.println("Distance in yard is"+distanceInyards+"and distance in miles is "+distanceInMiles);

    }
}



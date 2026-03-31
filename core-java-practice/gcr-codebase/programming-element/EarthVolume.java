import java.util.*;
public class EarthVolume {
    public static void main(String[] args) {
        int earthRadius=6378;
        double earthVolume=(4.0/3)*Math.PI*Math.pow(earthRadius,3);
        double volumeInMiles = earthVolume* Math.pow(0.621371, 3);
        System.out.println("The Volume of earth in cubic kilometre is "+earthVolume+"and cubic miles is "+volumeInMiles);
    }
}

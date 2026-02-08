package functional_interfaces.unit_conversion_tool;

public class LogisticsApp {

    public static void main(String[] args) {

        double distanceKm = 100;
        double weightKg = 50;
        // Calling static methods using interface name
        double miles = UnitConverter.kmToMiles(distanceKm);
        double pounds = UnitConverter.kgToLbs(weightKg);
        System.out.println(distanceKm + " km = " + miles + " miles");
        System.out.println(weightKg + " kg = " + pounds + " lbs");
    }
}


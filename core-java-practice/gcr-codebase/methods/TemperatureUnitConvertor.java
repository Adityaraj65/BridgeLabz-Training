import java.util.Scanner;

public class TemperatureUnitConvertor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input fahrenheit
        System.out.println("Enter temperature in Fahrenheit");
        double fahrenheit = sc.nextDouble();
        // calling method to convert fahrenheit to celsius
        double fahrenheit2celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println("Fahrenheit into Celsius is : " + fahrenheit2celsius);

        // get input celsius
        System.out.println("\nEnter temperature in Celsius");
        double celsius = sc.nextDouble();
        // calling method to convert celsius to fahrenheit
        double celsius2fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println("Celsius into Fahrenheit is : " + celsius2fahrenheit);

        // get input pounds
        System.out.println("\nEnter weight in pounds");
        double pounds = sc.nextDouble();
        // calling method to convert pounds to kilograms
        double pounds2kilograms = convertPoundsToKilograms(pounds);
        System.out.println("Pounds into Kilograms is : " + pounds2kilograms);

        // get input kilograms
        System.out.println("\nEnter weight in kilograms");
        double kilograms = sc.nextDouble();
        // calling method to convert kilograms to pounds
        double kilograms2pounds = convertKilogramsToPounds(kilograms);
        System.out.println("Kilograms into Pounds is : " + kilograms2pounds);

        // get input gallons
        System.out.println("\nEnter volume in gallons");
        double gallons = sc.nextDouble();
        // calling method to convert gallons to liters
        double gallons2liters = convertGallonsToLiters(gallons);
        System.out.println("Gallons into Liters is : " + gallons2liters);

        // get input liters
        System.out.println("\nEnter volume in liters");
        double liters = sc.nextDouble();
        // calling method to convert liters to gallons
        double liters2gallons = convertLitersToGallons(liters);
        System.out.println("Liters into Gallons is : " + liters2gallons);

        sc.close();
    }

    // converting fahrenheit to celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // converting celsius to fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // converting pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds2kilograms * pounds;
    }

    // converting kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms2pounds * kilograms;
    }

    // converting gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons2liters * gallons;
    }

    // converting liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters2gallons * liters;
    }
}

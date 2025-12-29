import java.util.Scanner;

public class TemperatureConverter {

    // Converts Celsius to Fahrenheit
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Converts Fahrenheit to Celsius
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature value: ");
        double temperature = sc.nextDouble();

        if (choice == 1) {
            double result = celsiusToFahrenheit(temperature);
            System.out.println("Temperature in Fahrenheit: " + result);
        } else if (choice == 2) {
            double result = fahrenheitToCelsius(temperature);
            System.out.println("Temperature in Celsius: " + result);
        } else {
            System.out.println("Invalid choice");
        }
    }
}

package functional_interfaces.temperature_alert_system;

import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {
        double threshold = 40.0;
        // Predicate to check if temperature crosses threshold
        Predicate<Double> isHighTemperature =
                temp -> temp > threshold;
        // Sample temperature readings
        double[] temperatures = {32.5, 38.0, 41.2, 39.0, 45.6};
        for (double temp : temperatures) {
            if (isHighTemperature.test(temp)) {
                System.out.println("Alert! High temperature detected: " + temp + "°C");
            } else {
                System.out.println("Temperature normal: " + temp + "°C");
            }
        }
    }
}

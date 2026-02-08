package functional_interfaces.unit_conversion_tool;

public interface UnitConverter {
    // Convert kilometers to miles
    static double kmToMiles(double km) {
        return km * 0.621371;
    }
    // Convert kilograms to pounds
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}

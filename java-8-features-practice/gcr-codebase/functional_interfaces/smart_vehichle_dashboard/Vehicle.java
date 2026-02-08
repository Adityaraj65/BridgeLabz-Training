package functional_interfaces.smart_vehichle_dashboard;

public interface Vehicle {

    // Existing mandatory behavior
    void displaySpeed();

    // New feature added later
    default void displayBatteryPercentage() {
        System.out.println("Battery information not available.");
    }
}


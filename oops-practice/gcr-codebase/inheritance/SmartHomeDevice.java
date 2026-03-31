package inheritance;
public class SmartHomeDevice {
    public static void main(String[] args) {

        // Creating a Thermostat object
        Thermostat thermostat = new Thermostat("12535", "ON", 24);

        // Displaying the current status of the thermostat
        thermostat.displayStatus();
    }
}

// Superclass 
class Device {

    // Common attributes for all smart devices
    String deviceId;
    String status;

    // Constructor to initialize deviceId and status
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display basic device status
    void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status    : " + status);
    }
}

// Subclass representing a specific type of device: Thermostat
class Thermostat extends Device {

    // Additional attribute specific to Thermostat
    int temperatureSetting;

    // Constructor initializes both Device and Thermostat attributes
    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus to include temperature information
    @Override
    void displayStatus() {
        super.displayStatus(); // display common device details
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
    }
}

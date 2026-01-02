public class VehicleRegistrationSystem {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Honest raj", "Sedan", "ABC123");
        Vehicle v2 = new Vehicle("Price danish", "SUV", "XYZ789");

        // Static method call
        Vehicle.updateRegistrationFee(150.0);

        // Display vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

// Vehicle class
class Vehicle {

    // STATIC variable (common for all vehicles)
    static double registrationFee = 0.0;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // FINAL variable (cannot be changed)
    private final String registrationNumber;

    // Constructor using THIS
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // STATIC method
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    // Instance method with INSTANCEOF check
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid Vehicle instance");
        }
    }
}

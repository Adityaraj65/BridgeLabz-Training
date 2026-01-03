package inheritance;

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        // Creating instances of each vehicle subclass
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10000);
        vehicles[2] = new MotorCycle(150, "Petrol", "150cc");
        // Displaying their details
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
// Base class
class Vehicle {
    int maxSpeed;
    String fuelType;
    // Constructor
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    // Method to display vehicle info
    void displayInfo() {
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Fuel Type : " + fuelType);
    }
}
// Derived classes
class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Vehicle Type : Car");
        super.displayInfo();
        System.out.println("Seat Capacity : " + seatCapacity);
    }
}
// Derived classes
class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Vehicle Type : Truck");
        super.displayInfo();
        System.out.println("Load Capacity : " + loadCapacity);
    }
}
// Derived classes
class MotorCycle extends Vehicle {
    String engineCapacity;

    MotorCycle(int maxSpeed, String fuelType, String engineCapacity) {
        super(maxSpeed, fuelType);
        this.engineCapacity = engineCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Vehicle Type : Motorcycle");
        super.displayInfo();
        System.out.println("Engine Capacity : " + engineCapacity);
    }
}

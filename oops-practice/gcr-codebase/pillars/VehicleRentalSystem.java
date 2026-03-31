package pillars;

import java.util.ArrayList;
import java.util.List;

/*
 * Interface for insurance-related behavior
 */
interface Insurable {
    double calculateInsurance();

    String getInsuranceDetails();
}

// Abstract base class
abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    Vehicle(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = policyNumber;
    }

    abstract double calculateRentalCost(int days);

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public String getMaskedPolicyNumber() {
        return "XXXX-" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}

// Car implementation
class Car extends Vehicle implements Insurable {

    Car(String number, double rate, String policy) {
        super(number, "Car", rate, policy);
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance @10%";
    }
}

// Bike implementation
class Bike extends Vehicle implements Insurable {

    Bike(String number, double rate, String policy) {
        super(number, "Bike", rate, policy);
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance @5%";
    }
}

// Truck implementation
class Truck extends Vehicle {

    Truck(String number, double rate, String policy) {
        super(number, "Truck", rate, policy);
    }

    @Override
    double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 2000;
    }
}

// Utility class
class RentalProcessor {

    static void processRentals(List<Vehicle> vehicles, int days) {

        for (Vehicle v : vehicles) {

            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = 0;

            if (v instanceof Insurable) {
                insuranceCost = ((Insurable) v).calculateInsurance();
            }

            System.out.println("Vehicle Type   : " + v.getType());
            System.out.println("Vehicle Number : " + v.getVehicleNumber());
            System.out.println("Rental Cost    : " + rentalCost);
            System.out.println("Insurance Cost : " + insuranceCost);
            System.out.println("Policy ID      : " + v.getMaskedPolicyNumber());
            System.out.println("----------------------------------");
        }
    }
}

// Main class
public class VehicleRentalSystem {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR123", 3000, "CARPOL9876"));
        vehicles.add(new Bike("BIKE456", 800, "BIKEPOL4321"));
        vehicles.add(new Truck("TRUCK789", 7000, "TRKPOL6543"));

        RentalProcessor.processRentals(vehicles, 3);
    }
}

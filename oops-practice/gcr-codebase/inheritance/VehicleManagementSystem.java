package inheritance;
public class VehicleManagementSystem {
    public static void main(String[] args) {

        PetrolVehicle petrolCar = new PetrolVehicle(180, "Honda City");
        petrolCar.displayDetails();
        petrolCar.refuel();
        System.out.println();

        ElectricVehicle electricCar = new ElectricVehicle(160, "Tesla Model 3");
        electricCar.displayDetails();
        electricCar.charge();
    }
}

// Base class
class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayDetails() {
        System.out.println("Model     : " + model);
        System.out.println("Max Speed : " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    void refuel();
}

// Petrol vehicle
class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Action    : Refueling petrol tank");
    }
}

// Electric vehicle
class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Action    : Charging the battery");
    }
}

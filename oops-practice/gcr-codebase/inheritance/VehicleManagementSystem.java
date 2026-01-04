package inheritance;

// Interface
interface Refuelable {
    void refuel();
}

public class VehicleManagementSystem {
    public static void main(String[] args) {

        PetrolVehicle1 petrolCar = new PetrolVehicle1(180, "Honda City");
        petrolCar.displayDetails();
        petrolCar.refuel();
        System.out.println();

        ElectricVehicle1 electricCar = new ElectricVehicle1(160, "Tesla Model 3");
        electricCar.displayDetails();
        electricCar.charge();
    }
}

// Base class
class Vehicle1 {
    int maxSpeed;
    String model;

    Vehicle1(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayDetails() {
        System.out.println("Model     : " + model);
        System.out.println("Max Speed : " + maxSpeed + " km/h");
    }
}

// Petrol vehicle
class PetrolVehicle1 extends Vehicle1 implements Refuelable {

    PetrolVehicle1(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Action    : Refueling petrol tank");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Type      : Petrol Vehicle");
    }
}

// Electric vehicle
class ElectricVehicle1 extends Vehicle1 {

    ElectricVehicle1(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Action    : Charging the battery");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Type      : Electric Vehicle");
    }
}

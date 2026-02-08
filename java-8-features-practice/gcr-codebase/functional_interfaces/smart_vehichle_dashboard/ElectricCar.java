package functional_interfaces.smart_vehichle_dashboard;

public class ElectricCar implements Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Speed: 95 km/h");
    }
    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery: 72%");
    }
}


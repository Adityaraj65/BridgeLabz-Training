package functional_interfaces.smart_vehichle_dashboard;

public class PetrolCar implements Vehicle {

    @Override
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }
}


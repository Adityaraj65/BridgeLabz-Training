package functional_interfaces.smart_vehichle_dashboard;

public class Dashboard {

    public static void main(String[] args) {

        Vehicle petrol = new PetrolCar();
        petrol.displaySpeed();
        petrol.displayBatteryPercentage();

        Vehicle electric = new ElectricCar();
        electric.displaySpeed();
        electric.displayBatteryPercentage();
    }
}


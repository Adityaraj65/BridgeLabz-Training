package functional_interfaces.multi_vehicle_rental_system;

public class Bikes implements VehicleRentalSystem{
    boolean isAvailable=true;
    @Override
    public void rent() {

        if(isAvailable){
            isAvailable=false;
            System.out.println("bike rented successfully");
        }else{
            System.out.println("sorry Bus not available");
        }
    }

    @Override
    public void returnVehicle() {
        isAvailable=true;
        System.out.println("Bikes returned");

    }
}

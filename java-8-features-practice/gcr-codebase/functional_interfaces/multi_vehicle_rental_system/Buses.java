package functional_interfaces.multi_vehicle_rental_system;

public class Buses implements VehicleRentalSystem{
    boolean isAvailable=true;
    @Override
    public void rent() {
        if(isAvailable){
           isAvailable=false;
            System.out.println("bus rented successfully");
        }else{
            System.out.println("sorry Bus not available");
        }
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus returned ");
        isAvailable=false;
    }
}

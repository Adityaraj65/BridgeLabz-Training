package functional_interfaces.multi_vehicle_rental_system;

public class Cars implements VehicleRentalSystem{
    boolean isAvailable=true;
    @Override
    public void rent() {
        if(isAvailable){
            isAvailable=false;
            System.out.println("Car rented successfully");
        }else{
            System.out.println("sorry car not available");
        }
    }

    @Override
    public void returnVehicle() {
        isAvailable=true;
        System.out.println("car returned");

    }
}

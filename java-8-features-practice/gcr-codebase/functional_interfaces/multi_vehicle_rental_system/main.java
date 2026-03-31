package functional_interfaces.multi_vehicle_rental_system;

public class main {
    public static void main(String[] args) {
        Buses b=new Buses();
        Cars c= new Cars();
        Bikes bi= new Bikes();
        b.rent();
        b.rent();
        b.returnVehicle();
        c.rent();
        c.returnVehicle();
        bi.rent();
        bi.returnVehicle();

    }
}

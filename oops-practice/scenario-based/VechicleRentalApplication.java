import java.util.ArrayList;
public class VechicleRentalApplication {
    public static void main(String[] args) {
        VehicleService v=new VehicleService();
        Vehicle bike=new Bike(1,"hero",300);
        Vehicle car=new Car(2,"tata",1000);
        Vehicle truck=new Truck(3,"Tesla",3000);
        v.addVehicle(bike);
        v.addVehicle(car);
        v.addVehicle(truck);

        v.displayVehicle();

        v.rentVehicle(2, 3); // rent car for 3 days

        v.displayVehicle();

        v.deleteVehicle(1); // remove bike
    }
}
interface IRentable{
    double calculateRent(int days);
}
class Vehicle implements IRentable{
    protected int vehicleId;
    protected String brand;
    protected int pricePerDay;
    protected boolean isAvailable;
    public Vehicle(int vehicleId,String brand,int pricePerDay){
        this.vehicleId=vehicleId;
        this.brand=brand;
        this.pricePerDay=pricePerDay;
        this.isAvailable=true;
    }
    @Override
    public double calculateRent(int days){
        return pricePerDay*days;
    }
}
class Bike extends Vehicle {
    Bike(int vehicleId, String brand, int pricePerDay ){
        super(vehicleId,brand,pricePerDay);
    }
    public double calculateRent(int days){
        return pricePerDay*days;
    }
}
class Car extends Vehicle{
    Car(int vehicleId, String brand, int pricePerDay){
        super(vehicleId,brand,pricePerDay);
    }
    public double calculateRent(int days){
        return (pricePerDay*days)+500;
    }
}
class Truck extends Vehicle  {

    Truck(int vehicleId, String brand, int  pricePerDay) {
        super(vehicleId, brand, pricePerDay);
    }

    public double calculateRent(int days) {
        // trucks cost more
        return (pricePerDay * days) + 1000;
    }
}
class VehicleService{
    private ArrayList<Vehicle>vehicles=new ArrayList<>();
    void addVehicle(Vehicle v){
        vehicles.add(v);
        System.out.println("vehicle added successfully");
    }
    void displayVehicle(){
        if(vehicles.size()==0){
            System.out.println("no vehicle to removed");
            return;
        }
        for(Vehicle v:vehicles){
            System.out.println("Id : "+ v.vehicleId+", Brand : "+v.brand+", Price per day : "+ v.pricePerDay+", Available : "+ v.isAvailable);
        }
    }
    void rentVehicle(int vehicleId,int days){
        for(Vehicle v: vehicles){
            if(v.vehicleId==vehicleId){
                if(!v.isAvailable){
                    System.out.println("Vehicle already Rented");
                    return;
                }
                double rent=v.calculateRent(days);
                v.isAvailable=false;
                System.out.println("Vehicle Rented successfully");
                System.out.println("total rent : "+ rent);
                return ;
            }
        }
        System.out.println("vehicle not found");
    }
    void deleteVehicle(int vehicleId){
        for(int i=0;i<vehicles.size();i++){
            if(vehicles.get(i).vehicleId==vehicleId){
                vehicles.remove(i);
                System.out.println("vehicle removed");
                break;
            }
        }
    }
}

class Customer{
    String name;
    int id;
    Customer(String name,int id){
        this.name=name;
        this.id=id;
    }
}


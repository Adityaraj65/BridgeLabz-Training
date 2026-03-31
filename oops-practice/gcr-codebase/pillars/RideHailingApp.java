package pillars;

// Handles GPS-related features
interface GPS {
    void updateLocation(String location);

    String getCurrentLocation();
}

// Base vehicle class for ride-hailing
abstract class RideVehicle {

    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public RideVehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    // Displays vehicle details
    public void getVehicleDetails() {
        System.out.println(vehicleId + " | Driver: " + driverName);
    }

    // Fare calculation varies by vehicle type
    public abstract double calculateFare(double distance);
}

// Car implementation
class RideCar extends RideVehicle implements GPS {

    private String location;

    public RideCar(String id, String driver) {
        super(id, driver, 15);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }
}

// Bike implementation
class RideBike extends RideVehicle {

    public RideBike(String id, String driver) {
        super(id, driver, 8);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}

// Auto implementation
class RideAuto extends RideVehicle {

    public RideAuto(String id, String driver) {
        super(id, driver, 10);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 20;
    }
}

// Demonstrates polymorphism
class RideHailingSystem {

    public static void main(String[] args) {

        RideVehicle[] rides = {
                new RideCar("C101", "Ramesh"),
                new RideBike("B201", "Suresh"),
                new RideAuto("A301", "Mahesh")
        };

        for (RideVehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare: ₹" + v.calculateFare(10));
        }
    }
}

import java.util.ArrayList;
import java.util.List;

// Custom Exception
class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}

// User class
class User {
    int userId;
    String name;

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }
}

// Driver class
class Driver {
    int driverId;
    String name;
    boolean available = true;

    Driver(int driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }
}

// Ride class
class Ride {
    User user;
    Driver driver;
    double distance;
    double fare;

    Ride(User user, Driver driver, double distance, double fare) {
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = fare;
    }
}

// Fare Calculator Interface (Abstraction)
interface FareCalculator {
    double calculateFare(double distance);
}

// Normal Pricing
class NormalFareCalculator implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 10;
    }
}

// Peak Pricing
class PeakFareCalculator implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 15;
    }
}

// Ride Service
class RideService {

    List<Driver> drivers;
    List<Ride> rideHistory = new ArrayList<>();

    RideService(List<Driver> drivers) {
        this.drivers = drivers;
    }

    // Book Ride (CREATE)
    Ride bookRide(User user, double distance, boolean isPeak)
            throws NoDriverAvailableException {

        Driver driver = assignDriver();

        FareCalculator calculator;
        if (isPeak) {
            calculator = new PeakFareCalculator();
        } else {
            calculator = new NormalFareCalculator();
        }

        double fare = calculator.calculateFare(distance);

        Ride ride = new Ride(user, driver, distance, fare);
        rideHistory.add(ride);

        return ride;
    }

    // Driver Assignment (UPDATE)
    private Driver assignDriver() throws NoDriverAvailableException {
        for (Driver d : drivers) {
            if (d.available) {
                d.available = false;
                return d;
            }
        }
        throw new NoDriverAvailableException("No drivers available right now");
    }

    // Ride History (READ)
    void showRideHistory() {
        for (Ride r : rideHistory) {
            System.out.println("User: " + r.user.name + ", Driver: " + r.driver.name + ", Distance: " + r.distance +
                    ", Fare: " + r.fare);
        }
    }
}

// Main Class
public class RideManagementSystem {

    public static void main(String[] args) {

        // Users
        User u1 = new User(1, "Aditya");

        // Drivers
        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver(101, "Ramesh"));
        drivers.add(new Driver(102, "Suresh"));

        RideService rideService = new RideService(drivers);

        // Book Ride
        try {
            Ride ride1 = rideService.bookRide(u1, 12, false);
            System.out.println("Ride booked!");
            System.out.println("Driver: " + ride1.driver.name);
            System.out.println("Fare: " + ride1.fare);
        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }

        // Peak hour ride
        try {
            Ride ride2 = rideService.bookRide(u1, 8, true);
            System.out.println("Ride booked in peak hour!");
            System.out.println("Driver: " + ride2.driver.name);
            System.out.println("Fare: " + ride2.fare);
        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }

        // Ride History
        System.out.println("\nRide History:");
        rideService.showRideHistory();
    }
}

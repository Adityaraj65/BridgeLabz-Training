package RestaurantTableReservationSystem;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        RestaurantReservationSystem system = new RestaurantReservationSystem();

        try {
            system.reserveTable(1, "7PM-8PM", "Aditya");
            system.reserveTable(2, "7PM-8PM", "Rahul");

            // This will throw exception (double booking)
            system.reserveTable(1, "7PM-8PM", "Aman");

        } catch (TableAlreadyReservedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        system.showAvailableTables("7PM-8PM");

        system.cancelReservation(1, "7PM-8PM");

        system.showAvailableTables("7PM-8PM");
    }
}

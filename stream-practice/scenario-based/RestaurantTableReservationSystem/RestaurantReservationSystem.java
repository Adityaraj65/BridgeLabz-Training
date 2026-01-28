package RestaurantTableReservationSystem;
import java.util.*;
public class RestaurantReservationSystem {
    // Map to store tableNumber -> Table
    private Map<Integer, Table> tables = new HashMap<>();

    // List to store all reservations
    private List<Reservation> reservations = new ArrayList<>();

    // Add some tables to restaurant
    public RestaurantReservationSystem() {
        tables.put(1, new Table(1, 2));
        tables.put(2, new Table(2, 4));
        tables.put(3, new Table(3, 6));
    }

    // Reserve a table
    public void reserveTable(int tableNumber, String timeSlot, String customerName)
            throws TableAlreadyReservedException {

        // Check if table exists
        if (!tables.containsKey(tableNumber)) {
            System.out.println("Table does not exist.");
            return;
        }

        // Check for double booking
        for (Reservation r : reservations) {
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                throw new TableAlreadyReservedException(
                        "Table " + tableNumber + " is already reserved for " + timeSlot);
            }
        }

        // If not reserved, add reservation
        reservations.add(new Reservation(tableNumber, timeSlot, customerName));
        System.out.println("Table reserved successfully for " + customerName);
    }

    // Cancel reservation
    public void cancelReservation(int tableNumber, String timeSlot) {
        Iterator<Reservation> iterator = reservations.iterator();

        while (iterator.hasNext()) {
            Reservation r = iterator.next();
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                iterator.remove();
                System.out.println("Reservation cancelled successfully.");
                return;
            }
        }

        System.out.println("No reservation found to cancel.");
    }

    // Show available tables for a time slot
    public void showAvailableTables(String timeSlot) {
        System.out.println("Available tables for time slot: " + timeSlot);

        for (Table table : tables.values()) {
            boolean isReserved = false;

            for (Reservation r : reservations) {
                if (r.tableNumber == table.tableNumber && r.timeSlot.equals(timeSlot)) {
                    isReserved = true;
                    break;
                }
            }

            if (!isReserved) {
                System.out.println("Table " + table.tableNumber +
                        " (Capacity: " + table.capacity + ")");
            }
        }
    }
}

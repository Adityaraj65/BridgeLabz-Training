package hotel_reservation;

public class Room {
    int roomNumber;
    double basePrice;
    boolean isAvailable = true;

    public Room(int roomNumber, double basePrice) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
    }
}


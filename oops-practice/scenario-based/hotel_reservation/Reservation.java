package hotel_reservation;

public class Reservation {
    Room room;
    Guest guest;
    int days;
    PricingStrategy pricingStrategy;

    public Reservation(Room room, Guest guest, int days, PricingStrategy pricingStrategy)
            throws RoomNotAvailableException {

        // Check room availability
        if (!room.isAvailable) {
            throw new RoomNotAvailableException("Room is already booked!");
        }

        this.room = room;
        this.guest = guest;
        this.days = days;
        this.pricingStrategy = pricingStrategy;

        // Mark room as booked
        room.isAvailable = false;
    }

    // Check-in logic
    public void checkIn() {
        System.out.println(guest.name + " checked into room " + room.roomNumber);
    }

    // Check-out logic
    public void checkOut() {
        room.isAvailable = true;
        System.out.println(guest.name + " checked out");
    }

    // Generate invoice
    public void generateInvoice() {
        double bill = pricingStrategy.calculatePrice(room.basePrice, days);
        System.out.println("Total bill for " + days + " days: ₹" + bill);
    }
}


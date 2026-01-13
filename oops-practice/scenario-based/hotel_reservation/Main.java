package hotel_reservation;

public class Main {
    public static void main(String[] args) {

        // Create room
        Room room101 = new DeluxeRoom(101);

        // Create guest
        Guest aditya = new Guest(1, "Aditya");

        // Pricing strategy
        PricingStrategy pricing = new SeasonalPricing();

        try {
            // Book room
            Reservation reservation =
                    new Reservation(room101, aditya, 3, pricing);

            reservation.checkIn();
            reservation.generateInvoice();
            reservation.checkOut();

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}


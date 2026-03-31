package FlightBookingSystem;

public class Main {
    public static void main(String[] args) {
        Flight[] flights = new Flight[3];
        flights[0] = new Flight(101, "Delhi", "Mumbai", 30000,70);
        flights[1] = new Flight(102, "Delhi", "Bangalore", 200000,80);
        flights[2] = new Flight(103, "Delhi", "patna", 200000,80);
        //creating object and initializing
        BookingService service = new BookingService(flights);
        //searching flight
        service.searchFlight("delhi","patna");
//        booking flight
        service.bookFlight(101, "Aditya");
        //booking flight
        service.bookFlight(101, "Rahul");
        // display booking
        service.displayBookings();


    }
}

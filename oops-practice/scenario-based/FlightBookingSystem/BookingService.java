package FlightBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    //list to store all bookings
    private List<Booking>bookings=new ArrayList<>();
    //array to store flights
    private Flight[] flights;
    private int bookingCounter=1;
    //constructor
    public BookingService(Flight[] flights){
        this.flights=flights;
    }



// search flight with source and destination
    public void searchFlight(String source ,String destination){

        for(Flight flight: flights){
            if(flight.getSource().equalsIgnoreCase(source)&&flight.getDestination().equalsIgnoreCase(destination)){
                System.out.println("flight found flight id is :"+flight.getFlightId());
                return;
            }
        }
        System.out.println("flight not available ");
    }
    //book flight
    public void bookFlight(int flightId,String passengerName){
        for(Flight flight:flights){
            if(flight.getFlightId()==flightId&&flight.getAvailableSeat()>0){
                flight.changeAvailableSeat();
                Booking booking = new Booking(bookingCounter++,passengerName,flight);
                bookings.add(booking);
                System.out.println("Booking successful for : "+passengerName);
                return;
            }
        }
        System.out.println("flight not available ");

    }
    //display booking
    public void displayBookings() {
        for (Booking booking : bookings) {
            System.out.println(
                    "BookingId: " + booking.getBookingId() +
                            ", Passenger: " + booking.getPassengerName() +
                            ", Flight: " + booking.flight.getFlightId()
            );
        }
    }

}

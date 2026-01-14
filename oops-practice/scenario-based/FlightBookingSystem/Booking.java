package FlightBookingSystem;

public class Booking {
    private int bookingId;
    private String passengerName;
    Flight flight;

   //constructor
    Booking(int bookingId,String passengerName,Flight flight){
        this.bookingId=bookingId;
        this.passengerName=passengerName;
        this.flight=flight;

    }
    //getters
    public int getBookingId(){
        return bookingId;
    }
    public String getPassengerName(){
        return passengerName;
    }

}

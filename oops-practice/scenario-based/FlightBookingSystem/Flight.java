package FlightBookingSystem;

import java.util.ArrayList;

public class Flight {
    //instance variable
    private int flightId;
    private String source;
    private String destination;
    private int price;
    private int availableSeat;
    //constructor
    public Flight(int flightId,String source,String destination,int price,int availableSeat){
        this.flightId=flightId;
        this.source=source;
        this.destination=destination;
        this.price=price;
        this.availableSeat=availableSeat;


    }
    //getters
    public int getFlightId(){
        return flightId;
    }
    public String getSource(){
        return source;
    }
    public void changeAvailableSeat(){
        availableSeat--;
    }
    public String getDestination(){
        return destination;
    }
    public int getPrice(){
        return price;
    }
    public int getAvailableSeat(){
        return availableSeat;
    }
}


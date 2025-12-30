public class MovieTicketBookingSystem {
    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket();

        // 1. Before booking
        ticket.displayTicketDetails();

        // 2. First booking
        ticket.bookTicket("Dragon", "A10", 120.0);

        // 3. Repeated booking attempts
        ticket.bookTicket("Dragon", "A10", 120.0);
        ticket.bookTicket("Dragon", "A10", 120.0);

        // 4. Display price
        ticket.displayTicketDetails();

        // Blank line as required in output
        System.out.println();

        // 5. New ticket object
        MovieTicket ticket2 = new MovieTicket();
        ticket2.bookTicket("Dragon", "A10", 120.0);
        ticket2.displayTicketDetails();
    }
}

// Class Definition
class MovieTicket {

    // Fields
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket() {
        isBooked = false;
    }

    // Method to book ticket
    public void bookTicket(String movieName, String seatNumber, double price) {
        if (!isBooked) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            isBooked = true;

            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
        } else {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (!isBooked) {
            System.out.println("Ticket have not booked yet....");
        } else {
            System.out.println("Price: $" + price);
        }
    }
}


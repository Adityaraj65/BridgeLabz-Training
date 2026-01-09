package linked_list;

import java.util.Scanner;

// Ticket Node representing What information each ticket have
class TicketNode {
    int ticketId;                                       // Stores the Ticket ID
    String customerName;                                // Stores the Customer Name
    String movieName;                                   // Stores the Movie Name
    String seatNumber;                                  // Stores the Seat number
    String bookingTime;                                 // Stores the Booking ID
    TicketNode next;

    // Constructor of TicketNode class to initialize variables
    public TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }
}

class TicketReservationSystem {
    private TicketNode tail = null;
    private int count = 0;

    // This method Add a new ticket at the end of the list
    public void addTicket(TicketNode ticket) {
        if (tail == null) {
            ticket.next = ticket;
            tail = ticket;
        } else {
            ticket.next = tail.next;
            tail.next = ticket;
            tail = ticket;
        }
        count++;
        System.out.println("Ticket booked successfully!");
    }

    //This method Remove ticket by ticket ID
    public void removeTicket(int ticketId) {
        if (tail == null) {
            System.out.println("No tickets found.");
            return;
        }
        TicketNode curr = tail.next, prev = tail;
        boolean found = false;
        do {
            if (curr.ticketId == ticketId) {
                found = true;
                break;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != tail.next);
        if (!found) {
            System.out.println("Ticket ID not found.");
            return;
        }
        if (curr == tail && curr == tail.next) {
            tail = null;
        } else {
            prev.next = curr.next;
            if (curr == tail) tail = prev;
        }
        count--;
        System.out.println("Ticket with ID " + ticketId + " removed.");
    }

    // This method Display all tickets booked
    public void displayTickets() {
        if (tail == null) {
            System.out.println("No tickets to display.");
            return;
        }
        System.out.println("\n--- Booked Tickets ---");
        TicketNode curr = tail.next;
        do {
            printTicket(curr);
            curr = curr.next;
        } while (curr != tail.next);
    }

    // This method search the ticket by customer name or Movie Name
    public void searchTicket(String keyword) {
        if (tail == null) {
            System.out.println("No tickets to search.");
            return;
        }
        TicketNode curr = tail.next;
        boolean found = false;
        do {
            if (curr.customerName.equalsIgnoreCase(keyword) || curr.movieName.equalsIgnoreCase(keyword)) {
                printTicket(curr);
                found = true;
            }
            curr = curr.next;
        } while (curr != tail.next);
        if (!found) {
            System.out.println("No ticket found for: " + keyword);
        }
    }

    // This method shows the total tickets booked
    public void totalTickets() {
        System.out.println("Total tickets booked: " + count);
    }

    // This method prints ticket
    private void printTicket(TicketNode t) {
        System.out.println("----------------------------");
        System.out.println("Ticket ID     : " + t.ticketId);
        System.out.println("Customer Name : " + t.customerName);
        System.out.println("Movie Name    : " + t.movieName);
        System.out.println("Seat Number   : " + t.seatNumber);
        System.out.println("Booking Time  : " + t.bookingTime);
    }
}

public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        // Creating the object of TicketReservationSystem class
        TicketReservationSystem list = new TicketReservationSystem();

        // Creating 6 Object of TicketNode class
        TicketNode ticket1 = new TicketNode(1, "Rahul Sharma", "Inception", "A12", "10:30 AM");
        TicketNode ticket2 = new TicketNode(2, "Anita Verma", "Interstellar", "B05", "11:00 AM");
        TicketNode ticket3 = new TicketNode(3, "Karan Singh", "Dhurandhar : part 1", "C18", "12:15 PM");
        TicketNode ticket4 = new TicketNode(4, "Pooja Mehta", "Avengers: Endgame", "D09", "01:45 PM");
        TicketNode ticket5 = new TicketNode(5, "Amit Patel", "Jawan", "E21", "03:30 PM");

        // Connecting nodes with each other
        list.addTicket(ticket1);
        list.addTicket(ticket2);
        list.addTicket(ticket3);
        list.addTicket(ticket4);
        list.addTicket(ticket5);

        // Displaying the list of movie in forward direction
        list.displayTickets();

        // Removing a ticker by its ticketID
        list.removeTicket(4);

        // Searching the movie by using customer name
        list.searchTicket("Karan Singh");

        // Display the total number of tickets booked
        list.totalTickets();

    }
}

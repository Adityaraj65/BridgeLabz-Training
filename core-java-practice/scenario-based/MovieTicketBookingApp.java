import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueBooking = "yes";

        while (continueBooking.equalsIgnoreCase("yes")) {

            double basePrice = 0;
            double seatCharge = 0;
            double snackCharge = 0;

            // Movie type input
            System.out.print("Enter movie type (Action / Comedy / Drama): ");
            String movieType = sc.next();

            // Switch for movie type
            switch (movieType.toLowerCase()) {
                case "action":
                    basePrice = 250;
                    break;
                case "comedy":
                    basePrice = 200;
                    break;
                case "drama":
                    basePrice = 180;
                    break;
                default:
                    System.out.println("Invalid movie type. Booking cancelled.");
                    continue;
            }

            // Seat type input
            System.out.print("Enter seat type (Gold / Silver): ");
            String seatType = sc.next();

            if (seatType.equalsIgnoreCase("gold")) {
                seatCharge = 100;
            } else if (seatType.equalsIgnoreCase("silver")) {
                seatCharge = 50;
            } else {
                System.out.println("Invalid seat type. Booking cancelled.");
                continue;
            }

            // Snacks input
            System.out.print("Do you want snacks? (yes/no): ");
            String snacksChoice = sc.next();

            if (snacksChoice.equalsIgnoreCase("yes")) {
                snackCharge = 80;
            }

            // Total calculation
            double totalAmount = basePrice + seatCharge + snackCharge;

            // Booking summary
            System.out.println("\n--- Booking Summary ---");
            System.out.println("Movie Type : " + movieType);
            System.out.println("Seat Type  : " + seatType);
            System.out.println("Snacks     : " + snacksChoice);
            System.out.println("Total Bill : Rs" + totalAmount);
            System.out.println("-----------------------\n");

            // Next customer
            System.out.print("Is there another customer? (yes/no): ");
            continueBooking = sc.next();
        }

        System.out.println("Ticket booking closed. Thank you!");
    }
}


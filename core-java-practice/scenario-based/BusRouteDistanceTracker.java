import java.util.Scanner;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stopDistance = 5; // distance per stop in km
        int totalDistance = 0;
        String choice;
        // calculating total distance travel
        while (true) {
            totalDistance += stopDistance;
            System.out.println("Bus reached next stop.");
            System.out.println("Total distance traveled: " + totalDistance + " km");
            //asking if passenger want to get off
            System.out.print("Do you want to get off here? (yes/no): ");
            choice = sc.next();
            // checking if passenger getoff then display total distance travelled
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Passenger got off.");
                System.out.println("Final distance traveled: " + totalDistance + " km");
                break;
            }
        }
    }
}

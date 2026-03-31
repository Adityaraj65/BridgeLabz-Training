package aero_vigil_problem;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FlightUtil flightUtil = new FlightUtil();
        System.out.println("Enter flight details");
        System.out.println("<FlightNumber>:<FlightName>:<PassengerCount>:<CurrentFuel>Level>.");
        try {
            // Read input
            String input = sc.nextLine();
            // Split input using colon
            String[] details = input.split(":");
            String flightNumber = details[0];
            String flightName = details[1];
            int passengerCount = Integer.parseInt(details[2]);
            double currentFuelLevel = Double.parseDouble(details[3]);
            // Validations
            flightUtil.validateFlightNumber(flightNumber);
            flightUtil.validateFlightName(flightName);
            flightUtil.validatePassengerCount(passengerCount, flightName);
            // Fuel calculation
            double fuelRequired = flightUtil.calculateFuelToFillTank(flightName, currentFuelLevel);
            System.out.println(
                    "Fuel required to fill the tank: " + fuelRequired + " liters"
            );
        } catch (InvalidFlightException e) {
            // Handle custom exception
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Handle unexpected errors
            System.out.println("Invalid input format");
        }
    }
}
/*sample input to test
Sample Input / Output 1
Enter flight details

FL-1234:SpiceJet:250:50000
Fuel required to fill the tank: 150000.0 liters

Sample Input / Output 2
Enter flight details
FL-5678:Air Asia:120:60000
The flight name Air Asia is invalid

Sample Input / Output 3
Enter flight details
FL-100:Vistara:200:100000
The flight number FL-100 is invalid

Sample Input / Output 4
Enter flight details
FL-2345:IndiGo:250:120000
The passenger count 250 is invalid for IndiGo
*/
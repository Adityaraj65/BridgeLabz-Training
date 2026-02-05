package aero_vigil_problem;
public class FlightUtil {

    // Validate flight number using regex
    public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
        // Format: FL-XXXX where XXXX is between 1000 and 9999
        if (!flightNumber.matches("FL-[1-9][0-9]{3}")) {
            throw new InvalidFlightException(
                    "The flight number " + flightNumber + " is invalid"
            );
        }
        return true;
    }

    // Validate flight name
    public boolean validateFlightName(String flightName) throws InvalidFlightException {
        if (!(flightName.equalsIgnoreCase("SpiceJet") ||
                flightName.equalsIgnoreCase("Vistara") ||
                flightName.equalsIgnoreCase("IndiGo") ||
                flightName.equalsIgnoreCase("Air Arabia"))) {
            throw new InvalidFlightException("The flight name " + flightName + " is invalid"
            );
        }
        return true;
    }
    // Validate passenger count based on flight capacity
    public boolean validatePassengerCount(int passengerCount, String flightName)
            throws InvalidFlightException {
        int maxCapacity = 0;
        switch (flightName) {
            case "SpiceJet":
                maxCapacity = 396;
                break;
            case "Vistara":
                maxCapacity = 615;
                break;
            case "IndiGo":
                maxCapacity = 230;
                break;
            case "Air Arabia":
                maxCapacity = 130;
                break;
        }

        if (passengerCount <= 0 || passengerCount > maxCapacity) {
            throw new InvalidFlightException(
                    "The passenger count " + passengerCount +
                            " is invalid for " + flightName
            );
        }
        return true;
    }
    // Calculate fuel required to fill the tank
    public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
        double maxFuelCapacity = 0;

        switch (flightName) {
            case "SpiceJet":
                maxFuelCapacity = 200000;
                break;
            case "Vistara":
                maxFuelCapacity = 300000;
                break;
            case "IndiGo":
                maxFuelCapacity = 250000;
                break;
            case "Air Arabia":
                maxFuelCapacity = 150000;
                break;
        }

        if (currentFuelLevel < 0 || currentFuelLevel > maxFuelCapacity) {
            throw new InvalidFlightException(
                    "Invalid fuel level for " + flightName
            );
        }

        return maxFuelCapacity - currentFuelLevel;
    }
}

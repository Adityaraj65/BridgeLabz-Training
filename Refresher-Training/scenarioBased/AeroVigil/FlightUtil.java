package scenarioBased.AeroVigil;

public class FlightUtil {
	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
		if(!flightNumber.matches("FL-\\d{4}")) {
			throw new InvalidFlightException("The flight number "+flightNumber+" is invalid");
		}
		int number=Integer.parseInt(flightNumber.substring(3));
		if(number<1000||number>9999){
			throw new InvalidFlightException("the flight number is "+flightNumber+" is invalid");
		}
		return true;
	}
	public boolean validateFlightName(String flightName) throws InvalidFlightException {
		if(!(flightName.equalsIgnoreCase("Spicejet")
				||flightName.equalsIgnoreCase("vistara")||
				flightName.equalsIgnoreCase("IndiGo")||flightName.equalsIgnoreCase("Air Arabia"))) {
			throw new InvalidFlightException("Flight name "+flightName+" is invalid");
		}
		return true;
	}
	public boolean validatePassengerCount(int passengerCount,String flightName) throws InvalidFlightException {
		
		String name=flightName.toLowerCase();
		int maxCapacity=0;
		switch(name) {
		case "spicejet" :
			maxCapacity=396;
			break;
		case "vistara" :
			maxCapacity=615;
			break;
		case "indigo" :
			maxCapacity=230;
			break;
		case "air arabia" :
			maxCapacity=130;
			break;
			
		}
		if(passengerCount<=0||passengerCount>maxCapacity) {
			throw new InvalidFlightException("The passenger count "+passengerCount+" is invalid for "+flightName);
		}
		return true;
	}
	public double calculateFuelToFIllTank(String flightName,double currentFuelLevel) throws InvalidFlightException {
		
		String name=flightName.toLowerCase();
		double maxFuelCapacity=0;
		switch(name) {
		case "spicejet" :
			maxFuelCapacity=200000;
			break;
		case "vistara" :
			maxFuelCapacity= 300000;
			break;
		case "indigo" :
			maxFuelCapacity= 250000;
			break;
		case "air arabia" :
			maxFuelCapacity= 150000;
			break;
			
		}
		if(currentFuelLevel<0||currentFuelLevel>maxFuelCapacity) {
			throw new InvalidFlightException("Invalid fuel for "+flightName);
		}
		return maxFuelCapacity-currentFuelLevel;
	}
	
}	

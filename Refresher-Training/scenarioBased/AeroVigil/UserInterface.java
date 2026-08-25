package scenarioBased.AeroVigil;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) throws InvalidFlightException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter detail in this format/n <FlightNumber>:<FlightName>:<PassengerCount>:<CurrentFuel\r\n"
				+ "Level>.");
		String str=sc.nextLine();
		String[] arr=str.split(":");
		String flightNumber=arr[0];
		String flightName=arr[1];
		int passengerCount=Integer.parseInt(arr[2]);
		double currentFuelLevel=Double.parseDouble(arr[3]);
		FlightUtil f=new FlightUtil();
		if((f.validateFlightNumber(flightNumber))&&(f.validateFlightName(flightName))&&f.validatePassengerCount(passengerCount,flightName)) {
			System.out.println("fuel required to fill the tank is "+f.calculateFuelToFIllTank(flightName, currentFuelLevel));
		}
	}
}

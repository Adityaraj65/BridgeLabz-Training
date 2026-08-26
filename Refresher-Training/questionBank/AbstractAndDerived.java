package questionBank;

import java.util.Scanner;

abstract class Car1{
	abstract boolean isSedan(); 
	abstract int getSeats();
	abstract int getMileage();
}
class WagonR extends Car1{
	@Override
	boolean isSedan() {
		return false;
	}
	@Override
	int getSeats() {
		return 5;
	}
	@Override
	int getMileage() {
		return 12;
	}

	
}
class HondaCity extends Car1{
	@Override
	boolean isSedan() {
		return true;
	}
	@Override
	int getSeats() {
		return 9;
	}
	@Override
	int getMileage() {
		return 10;
	}

	
}
class InnovaCrysta extends Car1{
	@Override
	boolean isSedan() {
		return false;
	}
	@Override
	int getSeats() {
		return 9;
	}
	@Override
	int getMileage() {
		return 15;
	}

	
}
public class AbstractAndDerived {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter your choice\n0. for WagonR, \n1. for HondaCity \n2. for InnovaCrysta");
	    int n = sc.nextInt();
	    Car1 car = null;
	    if (n == 0) {
	        car = new WagonR();
	    } else if (n == 1) {
	        car = new HondaCity();
	    } else if (n == 2) {
	        car = new InnovaCrysta();
	    }
	    System.out.println("Is Sedan: " + car.isSedan());
	    System.out.println("Seats: " + car.getSeats());
	    System.out.println("Mileage: " + car.getMileage());
	    sc.close();
	}
	
}

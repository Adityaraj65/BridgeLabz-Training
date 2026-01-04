package constructors;

public class CarRentalSystem {

	public static void main(String[] args) {
        // Create CarRental object
        CarRental rental = new CarRental("Aditya", "Benz c", 5, 2000);
        rental.displayRentalDetails();

	}

}
class CarRental {
    // Instance variables
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }
    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
    // Method to display rental details
    void displayRentalDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println();
    }
}

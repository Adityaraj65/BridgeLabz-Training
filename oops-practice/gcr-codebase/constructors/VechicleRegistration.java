package constructors;

public class VechicleRegistration {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle("Mahesh" ,"bike");
		Vehicle v2=new Vehicle("Suresh" ,"car");
		Vehicle v3=new Vehicle("Ganesh" ,"Truck");
		// display vehicle details
		v1.displayVehicleDetails();
		v2.displayVehicleDetails();
		v3.displayVehicleDetails();
		//update registration fee
		Vehicle.updateRegistrationFee(1500);
		// display vehicle details after registration fee update
		v1.displayVehicleDetails();
		v2.displayVehicleDetails();
		v3.displayVehicleDetails();

	}

}
class Vehicle{
	
	//instance variable
	String ownerName;
	String vehicleType;
	
	//class variable
	static int registrationFee=1000;
	//constructor
	Vehicle(String ownerName,String vehicleType){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		
	}
	// display vehicle detail
	void displayVehicleDetails() {
		System.out.println("Vehicle Owner Name :"+ownerName);
		System.out.println("Vehicle Type : "+ vehicleType);
		System.out.println("Registration fee : "+registrationFee);
		
		
	}
	
	//update registration fee
	static void updateRegistrationFee(int newFee) {
		registrationFee=newFee;
	}
}
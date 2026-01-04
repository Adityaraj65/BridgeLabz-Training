package constructors;

public class UniversityManagementSystem {

	public static void main(String[] args) {
		// Create a PostgraduateStudent object
		 PostgraduateStudent pg = new PostgraduateStudent(101, "Aditya", 8.5);
		 pg.displayDetails();
	}

}
class Students{
	public int rollNumber;
	protected String name;
	private double CGPA;
	//parameterized constructor
	 Students(int rollNumber, String name, double CGPA) {
	        
		 this.rollNumber = rollNumber;
	     this.name = name;
	     this.CGPA = CGPA;
	  }

	 // Public methods to access private variable
	    
	 public double getCGPA() {
		 return CGPA;
	 }

	 public void setCGPA(double CGPA) {
	    this.CGPA = CGPA;
	 }
}
// subclass PostgraduateStudent
class PostgraduateStudent extends Students {

    PostgraduateStudent(int rollNumber, String name, double CGPA ) {
	   
    	super(rollNumber, name, CGPA);
	}
    void displayDetails() {
    	System.out.println("Roll No: " + rollNumber); // public
	    System.out.println("Name: " + name);          // protected
	    System.out.println("CGPA: " + getCGPA());     // private via method

    }
}


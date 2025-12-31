public class OnlineCourseManagement {

	public static void main(String[] args) {
		 Course c1 = new Course("Java", 12, 15000);
	     Course c2 = new Course("Python", 10, 12000);
          //displaying detail before update
	      c1.displayCourseDetails();
	      c2.displayCourseDetails();

	      Course.updateInstituteName("full Stack Trainer");
           // displaying detail after update
	      c1.displayCourseDetails();
	      c2.displayCourseDetails();

	}

}
class Course{
	
	//Instance variables
	String courseName;
	int duration; // in month 
	int fee;
	
	//class variable 
	static String instituteName="Learn tech institute";
	
	 // Constructor
    Course(String courseName, int duration, int  fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

	// displaying course detail
	void displayCourseDetails() {
		System.out.println("Course name :"+courseName);
		System.out.println("Duration"+duration+"Month");
		System.out.println("Fee Rs :"+fee);
		System.out.println("Institue name :"+instituteName);;
	}
	//method to update institute name 
	static void updateInstituteName(String newName) {
		instituteName=newName;
	}
}

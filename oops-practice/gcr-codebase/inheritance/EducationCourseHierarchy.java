package inheritance;

public class EducationCourseHierarchy {
    public static void main(String[] args) {
        // Creating instance of PaidOnlineCourse
        PaidOnlineCourse c1=new PaidOnlineCourse("java", "9 month", "BridgeLabz", "No"
        ,10000,0.2);
        c1.displayDetails();
        
    }
}
// Base class
class Course{
    String courseName;
    String duration;
    Course(String courseName,String duration){
        this.courseName=courseName;
        this.duration=duration;
    }

    void displayDetails(){
        System.out.println("course Name :"+courseName);
        System.out.println("Duration : "+duration);
    }

}
// Derived classes
class OnlineCourse extends Course{
    String platform;
    String isRecorded;
    // Constructor
    OnlineCourse(String courseName,String duration,String platform, String isRecorded){
        super(courseName, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
    
    void displayDetails(){
        super.displayDetails();
        System.out.println("Platform : "+platform);
        System.out.println(" Is it Recorded : "+isRecorded);
    }

}
// Derived classes  
class PaidOnlineCourse extends OnlineCourse{
    //  Additional attributes
    int fee;
    double discount;
    double finalFee;
    // Constructor
    PaidOnlineCourse(String courseName, String duration, String platform, String isRecorded
        ,int fee,double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee=fee;
        this.discount=discount;
        this.finalFee=fee-(fee*discount);
    }
    // Overriding displayDetails method
    void displayDetails(){
        super.displayDetails();
        System.out.println("Fee : "+fee);
        System.out.println(" discount : "+discount);
        System.out.println("final fee : "+finalFee);
    }
}
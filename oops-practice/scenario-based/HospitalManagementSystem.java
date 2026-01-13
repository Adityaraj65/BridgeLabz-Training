import java.util.ArrayList;
import java.util.Scanner;


class noPatientException extends Exception{
    noPatientException(String message){
        super(message);
    }
}
public class HospitalManagementSystem {
    static ArrayList<Patient>patients=new ArrayList<>();
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("Welcome to Aditya Hospital ");
            System.out.println("----------------------------------");
            System.out.println("How can we help you ");
            System.out.println("Select one of the choice\n1. Add patient 2. view patient 3.Delete 4 exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    addPatient();
                    break;
                case 2:
                    viewPatient();
                    break;
                case 3:
                    deletePatient();
                    break;
                case 4:
                    System.exit(0);
            }
        }

    }

    static void addPatient(){
        System.out.println("===================================");
        System.out.println("select 1 ==> for Admitting patient :\nselect 2 ==> for consultation: ");
        int type=sc.nextInt();
        System.out.println("Enter the patientId");
        int id=sc.nextInt();
        System.out.println("Enter name :");
        String name=sc.next();
        System.out.println("Enter Age : ");
        int age =sc.nextInt();
        if(type==1){
            System.out.println(" Enter the number of days patient Admitted");
            int days=sc.nextInt();
            System.out.println("Enter daily charges");
            int charges=sc.nextInt();
            patients.add(new InPatient(id,name,age,days,charges));

        }else{
            System.out.println("Enter consultation fee :");
            int fee=sc.nextInt();
            patients.add(new OutPatient(id,name,age,fee));
        }
        System.out.println("Patient Added successfully");
    }
    static void viewPatient(){
        System.out.println("");
        for(Patient p :patients){
            p.displayInfo();
        }
    }
    static void deletePatient(){
        try {
            if (patients.size() <= 0) {
                throw new noPatientException("No patient to delete");
            }
            System.out.println("Enter patient id to delete patient :");
            int id=sc.nextInt();
            for(int i=0;i< patients.size();i++){
                if(patients.get(i).getPatientId()==id){
                    patients.remove(i);
                }
            }
            System.out.println("patient removed successfully ");
        }    catch (noPatientException e){
            System.out.println("Error : "+ e.getMessage());
        }
    }
}
interface Ipayable{
    double calculateBill();
}
abstract class Patient implements Ipayable {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId,String name,int age){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
    }
    public int getPatientId(){
        return patientId;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public abstract void displayInfo();

}
class InPatient extends Patient{
    private int numberOfDays;
    private int dailyCharge;
    public InPatient(int patientId,String name,int age,int numberOfDay,int dailyCharge){
        super(patientId,name,age);
        this.numberOfDays=numberOfDay;
        this.dailyCharge=dailyCharge;
    }
    public double calculateBill(){
        return numberOfDays*dailyCharge;
    }
    public void displayInfo(){
        System.out.println("name : "+getName());
        System.out.println("patient id : "+ getPatientId());
        System.out.println("Age : "+ getAge());
        System.out.println("number of Days : "+ numberOfDays);
        System.out.println("daily Charge : "+ dailyCharge);
        System.out.println("total bill :"+ calculateBill());
    }
}
class OutPatient extends Patient{
    int consultationFee;
    public OutPatient(int patientId,String name,int age,int fee){
        super(patientId,name,age);
        this.consultationFee=fee;
    }
    public double calculateBill(){
        return consultationFee;
    }
    public void displayInfo(){
        System.out.println("name : "+getName());
        System.out.println("patient id : "+ getPatientId());
        System.out.println("Age : "+ getAge());
        System.out.println("consultation fee: "+ consultationFee);
    }
}
class Doctor{
    private String name;
    private int age;
    private int doctorId;
    private String specialization;
    public Doctor(String name, int age, int doctorId, String specialization){
        this.name=name;
        this.age=age;
        this.doctorId=doctorId;
        this.specialization=specialization;
    }
    public void displayInfo(){
        System.out.println("DoctorId : "+doctorId);
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Specialization : "+specialization);
    }
}

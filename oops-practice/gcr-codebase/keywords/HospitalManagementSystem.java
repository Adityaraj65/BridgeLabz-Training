package keywords;

public class HospitalManagementSystem {
    public static void main(String[] args) {

        Patient p1 = new Patient("Lathika", 30, "Flu", "P001");
        Patient p2 = new Patient("Lidiya", 45, "Fracture", "P002");

        // Static method call
        Patient.getTotalPatients();

        // Display patient details
        p1.displayPatientDetails();
        p2.displayPatientDetails();
    }
}

// Patient class
class Patient {

    // STATIC variables
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // FINAL variable
    private final String patientID;

    // Constructor using THIS
    Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // STATIC method
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Instance method with INSTANCEOF
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid Patient instance");
        }
    }
}

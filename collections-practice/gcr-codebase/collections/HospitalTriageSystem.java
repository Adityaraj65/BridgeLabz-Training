package collections;

import java.util.PriorityQueue;

public class HospitalTriageSystem {
    public static void main(String[] args) {

        // Creating the object of Patient class
        Patient patient1 = new Patient("John",3);
        Patient patient2 = new Patient("Alice",5);
        Patient patient3 = new Patient("Bob",2);

        // Displaying the priority queue
        for(Patient p : Patient.pq){
            System.out.println("Patient Name : "+p.name+" and Severity : "+p.severity);
        }
    }
}

// Patient class
class Patient{
    String name;                                               // Stores the name of patient
    int severity;                                              // Stores the severity of patient
    static PriorityQueue<Patient> pq = new PriorityQueue<>((p1,p2) -> p2.severity - p1.severity);          // Stores the all patient details and prioritize on the basis of Higher severity

    // Constructor of Patient class to initialize variables
    public Patient(String name,int severity){
        this.name=name;
        this.severity=severity;
        pq.add(this);
    }
}

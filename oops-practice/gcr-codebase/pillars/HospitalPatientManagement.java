package pillars;

// Handles medical record operations
interface MedicalRecord {
    void addRecord(String record);

    void viewRecords();
}

// Base patient class
abstract class Patient {

    private String patientId;
    private String name;
    private int age;

    // Sensitive data protected
    private String medicalHistory;

    public Patient(String id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    // Displays patient info
    public void getPatientDetails() {
        System.out.println(patientId + " | " + name + " | Age: " + age);
    }

    // Each patient type calculates bill differently
    public abstract double calculateBill();
}

// Represents admitted patient
class InPatient extends Patient implements MedicalRecord {

    private double roomCharge = 2000;
    private String record;

    public InPatient(String id, String name, int age) {
        super(id, name, age);
    }

    // Includes room charges
    @Override
    public double calculateBill() {
        return roomCharge + 5000;
    }

    @Override
    public void addRecord(String record) {
        this.record = record;
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Record: " + record);
    }
}

// Represents OPD patient
class OutPatient extends Patient {

    public OutPatient(String id, String name, int age) {
        super(id, name, age);
    }

    // OPD consultation fee
    @Override
    public double calculateBill() {
        return 500;
    }
}

// Demonstrates runtime polymorphism
class HospitalPatientManagement {
    public static void main(String[] args) {

        Patient[] patients = {
                new InPatient("P101", "Aditya", 25),
                new OutPatient("P102", "Raj", 30)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: ₹" + p.calculateBill());
        }
    }
}


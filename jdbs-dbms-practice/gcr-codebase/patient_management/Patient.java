package patient_management;
import java.time.LocalDate;

public class Patient {

    // Fields match columns in patients table
    private int patientId;
    private String name;
    private LocalDate dob;
    private String phone;
    private String email;
    private String address;
    private String bloodGroup;

    // Constructor used while registering a new patient
    public Patient(String name, LocalDate dob, String phone,
                   String email, String address, String bloodGroup) {
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.bloodGroup = bloodGroup;
    }

    // Getters (JDBC needs these values to insert into DB)
    public String getName() { return name; }
    public LocalDate getDob() { return dob; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }
    public String getBloodGroup() { return bloodGroup; }
}


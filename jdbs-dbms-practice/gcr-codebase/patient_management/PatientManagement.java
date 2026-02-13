package patient_management;

import java.time.LocalDate;

public class PatientManagement{

    public static void main(String[] args) {

        PatientDAO dao = new PatientDAO();

        try {
            Patient patient = new Patient(
                    "Rahul Sharma",
                    LocalDate.of(1998, 5, 20),
                    "9876543210",
                    "rahul@gmail.com",
                    "Pune",
                    "O+"
            );

            // Step 1: Check uniqueness
            if (!dao.isPatientExists(patient.getPhone(), patient.getEmail())) {

                int patientId = dao.registerPatient(patient);
                System.out.println("Patient registered with ID: " + patientId);

            } else {
                System.out.println("Patient already exists!");
            }

            // Step 2: Search patient
            dao.searchPatientByName("Rahul");

        } catch (Exception e) {
            // Printing error stack for debugging
            e.printStackTrace();
        }
    }
}

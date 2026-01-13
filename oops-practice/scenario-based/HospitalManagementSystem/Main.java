package HospitalManagementSystem;

public class Main {
    public static void main(String[] args) {

        PatientCrud patientCrud = new PatientCrud();
        DoctorCrud doctorCrud = new DoctorCrud();
        AppointmentCrud appointmentCrud = new AppointmentCrud();

        Patient p1 = new Patient("Amar", 23, "male", 1, "fever");
        Patient p2 = new Patient("Ram", 26, "male", 2, "cold");

        patientCrud.addPatient(p1);
        patientCrud.addPatient(p2);

        Doctor d1 = new Doctor("Ravi", 32, "male", 101, "General Physician");
        Doctor d2 = new Doctor("Meenakshi", 29, "female", 102, "ENT");

        doctorCrud.addDoctor(d1);
        doctorCrud.addDoctor(d2);

        HospitalService hospitalService =
                new HospitalServiceImpl(patientCrud, doctorCrud, appointmentCrud);

        try {
            hospitalService.bookAppointment(1, 101);
        } catch (AppointmentNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        // fee calculation (polymorphism)
        double fee = hospitalService.calculateConsultationFee(101);
        System.out.println("Consultation Fee: " + fee);

        // cancel appointment
        hospitalService.cancelAppointment(1);

        // try booking again (should work now)
        try {
            hospitalService.bookAppointment(2, 101);
        } catch (AppointmentNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}

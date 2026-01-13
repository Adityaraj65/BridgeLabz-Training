package HospitalManagementSystem;

public class HospitalServiceImpl implements HospitalService {

    private PatientCrud patientCrud;
    private DoctorCrud doctorCrud;
    private AppointmentCrud appointmentCrud;
    private static int appointmentCounter = 1;

    // constructor
    public HospitalServiceImpl(PatientCrud patientCrud,
                               DoctorCrud doctorCrud,
                               AppointmentCrud appointmentCrud) {
        this.patientCrud = patientCrud;
        this.doctorCrud = doctorCrud;
        this.appointmentCrud = appointmentCrud;
    }

    @Override
    public void bookAppointment(int patientId, int doctorId)
            throws AppointmentNotAvailableException {

        // 1. get patient
        Patient patient = patientCrud.getPatientById(patientId);
        if (patient == null) {
            System.out.println("Patient not found");
            return;
        }

        // 2. get doctor
        Doctor doctor = doctorCrud.getDoctorById(doctorId);
        if (doctor == null) {
            System.out.println("Doctor not found");
            return;
        }

        // 3. check availability
        if (!doctor.isAvailable()) {
            throw new AppointmentNotAvailableException(
                    "Doctor is not available"
            );
        }

        // 4. create appointment
        Appointment appointment =
                new Appointment(patient, doctor, appointmentCounter++);

        // 5. save appointment
        appointmentCrud.addAppointment(appointment);

        // 6. update doctor availability
        doctor.changeAvailability();

        System.out.println("Appointment booked successfully");
    }

    @Override
    public double calculateConsultationFee(int doctorId) {

        Doctor doctor = doctorCrud.getDoctorById(doctorId);

        if (doctor == null) {
            System.out.println("Doctor not found");
            return 0;
        }

        return doctor.calculateFee(); // polymorphism happens here
    }


    @Override
    public void cancelAppointment(int appointmentId) {

        Appointment appointment =
                appointmentCrud.getAppointmentById(appointmentId);

        if (appointment == null) {
            System.out.println("Appointment not found");
            return;
        }

        Doctor doctor = appointment.getDoctor();
        doctor.makeAvailable();

        appointmentCrud.removeAppointment(appointmentId);

        System.out.println("Appointment cancelled successfully");
    }

}

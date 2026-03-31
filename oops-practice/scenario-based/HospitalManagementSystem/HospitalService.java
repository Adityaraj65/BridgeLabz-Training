package HospitalManagementSystem;

public interface HospitalService {

    void bookAppointment(int patientId, int doctorId)
            throws AppointmentNotAvailableException;

    void cancelAppointment(int appointmentId);

    double calculateConsultationFee(int doctorId);
}


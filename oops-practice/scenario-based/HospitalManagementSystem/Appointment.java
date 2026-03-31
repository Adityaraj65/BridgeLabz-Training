package HospitalManagementSystem;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    int appointmentId;
    public Appointment(Patient patient,Doctor doctor,int appointmentId){
        this.patient=patient;
        this.doctor=doctor;
        this.appointmentId=appointmentId;
    }
    public int getId(){
        return appointmentId;
    }
    public void displayAppointment(){
        System.out.println("Appointment id : "+appointmentId);
        patient.displayInfo();
        doctor.displayInfo();

    }
    public Doctor getDoctor() {
        return doctor;
    }


}

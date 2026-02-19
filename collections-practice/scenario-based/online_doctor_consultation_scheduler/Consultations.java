package online_doctor_consultation_scheduler;
public class Consultations {
    private String patientName;
    private String patientId;
    private String  slot;
    Doctors doctor;
    String specialization;
    public Consultations(String patientName,String patientId,String slot,String specialization){
        this.patientId=patientId;
        this.patientName=patientName;
        this.slot=slot;
        this.specialization=specialization;

    }
    public String getSpecialization(){
        return specialization;
    }
    public String getPatientName(){
        return patientName;
    }
    public String getPatientId(){
        return patientId;
    }
    public String getSlot(){
        return slot;
    }
    public void setDoctor(Doctors d){
        this.doctor=d;
    }
    public void getDoctor(){
        System.out.println(doctor.getDoctorName());
        System.out.println(doctor.getDoctorId());
    }

}

package online_doctor_consultation_scheduler;

public class Doctors {
    private String doctorName;
    private String doctorId;
    private String specialization;
    private String slot;
    boolean isAvailable=true;
    public Doctors(String doctorId,String doctorName,String specialization,String slot){
        this.doctorId=doctorId;
        this.doctorName=doctorName;
        this.specialization=specialization;
        this.slot=slot;
    }
    public String getDoctorId(){
        return this.doctorId;
    }
    public String getDoctorName(){
        return this.doctorName;
    }
    public String getSpecialization(){
        return this.specialization;
    }
    public String getSlot(){
      return this.slot;
    }
    public void doctorSlotBooked(){
        isAvailable=false;
    }
    public void doctorSlotUpdate(){
        isAvailable=true;
    }
    public boolean isAvailable() {
        return isAvailable;
    }


}

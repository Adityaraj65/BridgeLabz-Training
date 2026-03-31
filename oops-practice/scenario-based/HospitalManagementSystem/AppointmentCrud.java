package HospitalManagementSystem;

import java.util.ArrayList;

public class AppointmentCrud {
    private ArrayList<Appointment>appointment=new ArrayList<>();
    public void addAppointment(Appointment a){
        appointment.add(a);
        System.out.println("Appointment added");
        return;
    }
    public void displayAppointment(int id){
        if(appointment.isEmpty()){
            System.out.println("No appointment to display");
            return;
        }
        for(int i=0;i< appointment.size();i++){
            if(appointment.get(i).getId()==id){
                appointment.get(i).displayAppointment();
                return;
            }

        }
        System.out.println("No appointment found with this id ");

    }
    public Appointment getAppointmentById(int id) {
        for (Appointment a : appointment) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public void removeAppointment(int id) {
        for (int i = 0; i < appointment.size(); i++) {
            if (appointment.get(i).getId() == id) {
                appointment.remove(i);
                return;
            }
        }
    }

}

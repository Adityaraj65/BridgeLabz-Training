package HospitalManagementSystem;

import java.util.ArrayList;

public class DoctorCrud {
    private ArrayList<Doctor> doctor=new ArrayList<>();
    //add patient
    public void addDoctor(Doctor d){
        doctor.add(d);
        System.out.println("new Doctor added ");
    }
    //delete patient
    public void deleteDoctor(int id){
        if(doctor.isEmpty()){
            System.out.println("No Doctor available to delete patient ");
            return ;
        }
        for(int i=0;i<doctor.size();i++){
            if(doctor.get(i).getId()==id){
                doctor.remove(i);
                System.out.println("Doctor removed");
                return;
            }

        }
        System.out.println("Doctor with ID:"+id+"not found");
    }
    //read
    public void displayDoctorDetail(int id){
        if(doctor.isEmpty()){
            System.out.println("No Doctor available at the moment  ");
        }
        for(int i=0;i<doctor.size();i++){
            if(doctor.get(i).getId()==id){
                doctor.get(i).displayInfo();
            }
        }
        System.out.println("Doctor not found ");
    }
    public Doctor getDoctorById(int id) {
        for (Doctor d : doctor) {
            if (d.getId() == id) {
                return d;
            }
        }
        return null;
    }

}

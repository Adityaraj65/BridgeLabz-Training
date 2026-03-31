package HospitalManagementSystem;
import java.util.ArrayList;
public class PatientCrud {
    private ArrayList<Patient>patients=new ArrayList<>();
    //add patient
    public void addPatient(Patient p){
        patients.add(p);
        System.out.println("new Patient added ");
    }
    //delete patient
    public void deletePatient(int id){
        if(patients.isEmpty()){
            System.out.println("No patient available to delete patient ");
            return ;
        }
        for(int i=0;i<patients.size();i++){
            if(patients.get(i).getId()==id){
                patients.remove(i);
                System.out.println("Patient removed");
                return;
            }

        }
        System.out.println("Patien with ID:"+id+"not found");
    }
    //read
    public void displayPatientDetail(int id){
        if(patients.isEmpty()){
            System.out.println("No patient Available ");
        }
        for(int i=0;i<patients.size();i++){
            if(patients.get(i).getId()==id){
                patients.get(i).displayInfo();
            }
        }
        System.out.println("No such patient available ");
    }
    public Patient getPatientById(int id) {
        for (Patient p : patients) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

}

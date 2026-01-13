package HospitalManagementSystem;

public class Patient extends Person{
    protected String symptom;
    public Patient(String name,int age,String gender,int id,String symptom){
        super(name,age,gender,id);
        this.symptom=symptom;
    }
    public void displayInfo(){
        System.out.println("----patient detail-----------");
        System.out.println("Name :"+getName());
        System.out.println("ID : "+ getId());
        System.out.println("Age :"+ getAge());
        System.out.println("Gender "+getGender());
        System.out.println("Symptom : "+symptom);
    }
}

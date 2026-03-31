package HospitalManagementSystem;

public class Doctor extends Person{
    protected String specialization;
    private boolean isAvailable;
    public Doctor(String name,int age,String gender,int id,String specialization){
        super(name,age,gender,id);
        this.specialization=specialization;
        this.isAvailable=true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void changeAvailability(){
        this.isAvailable=false;
    }
    public void makeAvailable() {
        this.isAvailable = true;
    }


    public void displayInfo(){
        System.out.println("----Doctor detail-----------");
        System.out.println("Name :"+getName());
        System.out.println("ID : "+ getId());
        System.out.println("Age :"+ getAge());
        System.out.println("Gender "+getGender());
        System.out.println("Specialization : "+specialization);
        if(isAvailable){
            System.out.println("Availability : Available");
        }else{
            System.out.println("Not Available ");
        }


    }
    public double calculateFee() {
        return 300; // default fee
    }

}

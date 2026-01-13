package HospitalManagementSystem;

public class Person {
    private String name;
    private int age;
    private  String gender;
    private int id;
    //constructor
    public Person(String name,int age,String gender,int id){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.id=id;
    }
    //getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public int getId(){
        return id;
    }


}

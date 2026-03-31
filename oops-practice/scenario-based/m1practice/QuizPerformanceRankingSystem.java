package m1practice;

import java.util.ArrayList;
import java.util.Scanner;
class Student{
    String name;
    String department;
    int q1;
    int q2;
    int q3;
    public Student(String name,String department,int  q1,int q2,int q3){
        this.name=name;
        this.department=department;
        this.q1=q1;
        this.q2=q2;
        this.q3=q3;
    }
    public String getDepartment(){
        return department;
    }
    public String getName(){
        return name;
    }
    public int getQ1(){
        return q1;
    }
    public int getQ2(){
        return q2;
    }
    public int getQ3(){
        return q3;
    }
    public int getTotalScore(){
        return q1+q2+q3;
    }
}
public class QuizPerformanceRankingSystem {
    static ArrayList<Student>list=new ArrayList<>();

    public static void addRecord(String name,String department,int quiz1,int quiz2,int quiz3){
        Student s1=new Student(name,department,quiz1,quiz2,quiz3);
        list.add(s1);
        System.out.println("Record Added:"+name);
        return;

    }
    public static void topByDepartment(String department){
        int topScore=-1;
        for (Student student : list) {
            if (student.getDepartment().equals(department)) {
                if (topScore < student.getTotalScore()) {
                    topScore = student.getTotalScore();
                }
            }
        }
        for(Student s:list){
            if(s.department.equals(department)&& s.getTotalScore()==topScore){
                System.out.println(s.name+" "+s.getTotalScore());
            }
        }
    }
    public static int getQuizScore(Student s,String Quiz){
        return switch (Quiz) {
            case "Q1" -> s.q1;
            case "Q2" -> s.q2;
            case "Q3" -> s.q3;
            default -> -1;
        };
    }
    public static void topByQuiz(String quiz){
        int topScore=-1;
        for(Student s:list){
            int score=getQuizScore(s,quiz);
            topScore=Math.max(topScore,score);
        }
        for(Student s:list){
            if(getQuizScore(s,quiz)==topScore){
                System.out.println(s.name+" "+topScore);
            }
        }



    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str=sc.nextLine();
            String[] stringArray=str.split(" ");
            String operation=stringArray[0];
            switch(operation){
                case "Record":
                    String name=stringArray[1];
                    String department=stringArray[2];
                    int quiz1=Integer.parseInt(stringArray[3]);
                    int quiz2=Integer.parseInt(stringArray[4]);
                    int quiz3=Integer.parseInt(stringArray[5]);
                    addRecord(name,department,quiz1,quiz2,quiz3);
                    break;
                case "Top":
                    if(stringArray[1].equals("Q1")||stringArray[1].equals("Q2")||stringArray[1].equals("Q3")) {
                        topByQuiz(stringArray[1]);
                    }else{
                        topByDepartment(stringArray[1]);
                    }
                     break;
                default:
            }
        }
    }
}

import java.util.Scanner;
public class StudentVoteEligibility {
    public static void main(String[] args) {
        // creating scanner as object 
        Scanner sc= new Scanner(System.in);
        //created an array to store age of 10 student
        int [] studentAge=new int[10];
        System.out.println("enter age of 10 student ");
        for(int i=0;i<studentAge.length;i++){
        studentAge[i]=sc.nextInt();

        }
        //checking if student with input age can vote or not or age is invalid
        for(int i=0;i<studentAge.length;i++){
            if(studentAge[i]<0){
                System.out.println(studentAge[i]+" is an invalid age");
            }else if(studentAge[i]>18){
                System.out.println("student with the age "+studentAge[i]+" can vote");
            }else{
                System.out.println("The student with the age "+studentAge[i]+" cannot vote");
            }
        }
        sc.close();

    }
    

}

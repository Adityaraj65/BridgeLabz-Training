import java.util.Scanner;
public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter age of student no: "+(i+1));
            arr[i]=sc.nextInt();
            boolean result=canStudentVote(arr[i]);
            if(result){
                System.out.println("Student can vote ");
            }else{
                System.out.println("Student cannot vote ");
            }
            System.out.println();
        }

    }
    public static boolean canStudentVote(int age){
        if(age<0){
            return false;
        }else if(age>18){
            return true;
        }else{
            return false;
        }
    }
   
    
}


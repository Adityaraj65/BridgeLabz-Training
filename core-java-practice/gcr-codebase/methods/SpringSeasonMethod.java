import java.util.Scanner;
public class SpringSeasonMethod {
    public static void main(String[] args) {
        // create Scanner object.
        Scanner sc = new Scanner(System.in);
        // get input days
        System.out.println("Enter days");
        int day=sc.nextInt();
        // get input month 
        System.out.println("Enter month");
        int month=sc.nextInt();
        // calling checkSpring() to check spring season or not 
        boolean isSpring=checkSpring(day, month);
        // checking if ispring true it is spring season 
        if(isSpring){
            System.out.println("Its a spring season");
        }else{
            System.out.println("Not a Spring season");
        }

    }
    // method to check whether spring season or not .
    public static boolean checkSpring(int day , int month){
        if((month==3&& day>=20)||(month==4)||(month==5)||(month==6)&&(day<=20)){
            return true;
        }else{
            return false;
        }
    }

}

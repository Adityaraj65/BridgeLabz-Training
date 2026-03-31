import java.util.Scanner;
public class VoteEligibility {
    public static void main(String[] args) {
        // create a scanner object
        Scanner sc = new Scanner(System.in);
        // get input age 
        int age=sc.nextInt();
        // checking if person can vote or not 
        if(age>=18){
            System.out.println("The person's age is "+age+" and can vote.");// person age is greater than 18 and can vote 
        }else{
            System.out.println("The person's age is "+age+" and cannot vote."); // person age is not greater than 18 and cannot vote 
        }
        sc.close();
    }
}

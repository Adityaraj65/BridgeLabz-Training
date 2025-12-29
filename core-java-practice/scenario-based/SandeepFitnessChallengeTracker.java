import java.util.Scanner;

public class SandeepFitnessChallengeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] noOfPushup=new int[7];
        //taking no of pushup a week
        for(int i=0;i<7;i++){
            System.out.println("Enter the number of pushup for Day "+(i+1));
            noOfPushup[i]=sc.nextInt();
        }
        
        int totalPushup=0;
        int activedays=0;
       //using for each loop to calculate no of pushup in week and avg pushup
        for(int count:noOfPushup){
            if(count==0){
                continue;
            }else{
             totalPushup+=count;
             activedays++;
            }
        }
        double average=(double)totalPushup/activedays;
        System.out.println("\nweekly summary");
        System.out.println("Total active days : "+activedays);
        System.out.println("total no of push-ups are : "+totalPushup);
        System.out.println("Average pushup per active days : "+average);


    }
}

import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int voteCount1 = 0;
        int voteCount2 = 0;
        int voteCount3 = 0;

        while (true) {

            // get age of voter
            System.out.println("Enter age (enter -1 to stop voting)");
            int age = sc.nextInt();

            // exit condition
            if (age == -1) {
                break;
            }

            // check voting eligibility
            if (age >= 18) {
                System.out.println("You are eligible to vote");
                System.out.println("Press 1 for Candidate 1");
                System.out.println("Press 2 for Candidate 2");
                System.out.println("Press 3 for Candidate 3");

                // record vote
                int vote = sc.nextInt();

                if (vote == 1) {
                    voteCount1++;
                } else if (vote == 2) {
                    voteCount2++;
                } else if (vote == 3) {
                    voteCount3++;
                } else {
                    System.out.println("Invalid vote");
                }

            } else {
                System.out.println("You are not eligible to vote");
            }
        }

        // displaying final vote count
        System.out.println("\nVoting Result");
        System.out.println("Candidate 1 votes : " + voteCount1);
        System.out.println("Candidate 2 votes : " + voteCount2);
        System.out.println("Candidate 3 votes : " + voteCount3);

        sc.close();
    }
}

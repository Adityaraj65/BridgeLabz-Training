import java.util.Scanner;

public class YoungestAndTallestFriend {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Names of friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for age and height of each friend
        for (int i = 0; i < friends.length; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        // Assume first friend is youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find youngest and tallest friend
        for (int i = 1; i < friends.length; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("Youngest Friend: " + friends[youngestIndex]);
        System.out.println("Tallest Friend: " + friends[tallestIndex]);

        sc.close();
    }
}

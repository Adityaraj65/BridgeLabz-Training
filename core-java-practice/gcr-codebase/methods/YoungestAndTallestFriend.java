import java.util.Scanner;

public class YoungestAndTallestFriend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array to store names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // array to store age of friends
        int[] age = new int[3];

        // array to store height of friends
        double[] height = new double[3];

        // taking input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i]);
            age[i] = sc.nextInt();

            System.out.println("Enter height of " + names[i]);
            height[i] = sc.nextDouble();
        }

        // calling method to find youngest friend
        int youngestIndex = findYoungest(age);

        // calling method to find tallest friend
        int tallestIndex = findTallest(height);

        System.out.println("Youngest friend is : " + names[youngestIndex]);
        System.out.println("Tallest friend is : " + names[tallestIndex]);

        sc.close();
    }

    // method to find youngest friend
    public static int findYoungest(int[] age) {
        int minIndex = 0;

        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // method to find tallest friend
    public static int findTallest(double[] height) {
        int maxIndex = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}


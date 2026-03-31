import java.util.Scanner;

public class MeanHeightCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        // Take height input for 11 players
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum = sum + heights[i];
        }

        // Calculate mean height
        double meanHeight = sum / heights.length;

        System.out.println("Mean Height: " + meanHeight);

        sc.close();
    }
}

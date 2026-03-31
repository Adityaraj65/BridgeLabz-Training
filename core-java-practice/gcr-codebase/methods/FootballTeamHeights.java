public class FootballTeamHeights {

    public static void main(String[] args) {

        // array to store height of 11 players
        int[] heights = new int[11];

        // generating random height between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        // displaying heights
        System.out.println("Heights of players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.println(heights[i]);
        }

        // calling methods
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // displaying results
        System.out.println("\nShortest height : " + shortest + " cm");
        System.out.println("Tallest height  : " + tallest + " cm");
        System.out.println("Mean height    : " + mean + " cm");
    }

    // method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    // method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < min) {
                min = heights[i];
            }
        }
        return min;
    }

    // method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        return max;
    }
}


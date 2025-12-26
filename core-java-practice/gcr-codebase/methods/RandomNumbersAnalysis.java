public class RandomNumbersAnalysis {

    public static void main(String[] args) {

        // calling method to generate 5 random 4 digit numbers
        int[] numbers = generate4DigitRandomArray(5);

        // displaying generated numbers
        System.out.println("Generated 4 digit random numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // calling method to find average, min and max
        double[] result = findAverageMinMax(numbers);

        System.out.println("\nAverage value is : " + result[0]);
        System.out.println("Minimum value is : " + result[1]);
        System.out.println("Maximum value is : " + result[2]);
    }

    // method to generate array of 4 digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            // generating 4 digit random number (1000 to 9999)
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }

        return arr;
    }

    // method to find average, minimum and maximum value
    public static double[] findAverageMinMax(int[] numbers) {

        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

            // finding minimum value
            min = (int) Math.min(min, numbers[i]);

            // finding maximum value
            max = (int) Math.max(max, numbers[i]);
        }

        double average = sum / numbers.length;

        // storing average, min and max in array
        return new double[]{average, min, max};
    }
}

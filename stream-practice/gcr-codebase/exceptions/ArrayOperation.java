package exceptions;

public class ArrayOperation {

    static void printValue(int[] arr, int index) {

        try {
            // Try to access array element
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Index is invalid
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            // Array is not initialized
            System.out.println("Array is not initialized!");
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        // int[] numbers = null;   // uncomment to test NullPointerException

        int index = 2;  // change index to test out-of-range case

        printValue(numbers, index);
    }
}


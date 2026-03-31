import java.util.Scanner;

public class TwoDToOneDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        // Take input for 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] array = new int[rows * columns];
        int index = 0;

        // Copy 2D array into 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Print 1D array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        sc.close();
    }
}

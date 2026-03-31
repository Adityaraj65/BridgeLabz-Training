import java.util.Scanner;

public class ArrayIndexOutOfBound {

    // This method intentionally accesses an invalid index
    // to generate ArrayIndexOutOfBoundsException
    static void generateArrayException(String[] names) {
        // Accessing index equal to array length (invalid)
        System.out.println(names[names.length]);
    }

    // This method handles ArrayIndexOutOfBoundsException
    static void handleArrayException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled successfully");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking array size from user
        System.out.print("Enter number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        // Creating array of names
        String[] names = new String[size];

        // Taking names input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // First call: generate exception
        try {
            generateArrayException(names);
        } catch (RuntimeException e) {
            System.out.println("Exception generated in generateArrayException()");
        }

        // Second call: handle exception
        handleArrayException(names);

        scanner.close();
    }
}

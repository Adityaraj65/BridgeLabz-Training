import java.util.Scanner;

public class IllegalArgument {

    // Method to generate exception
    static void generateException(String text) {
        System.out.println(text.substring(4, 2));
    }

    // Method to handle exception
    static void handleException(String text) {
        try {
            System.out.println(text.substring(4, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // Generate exception
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception generated");
        }

        // Handle exception
        handleException(text);

        sc.close();
    }
}

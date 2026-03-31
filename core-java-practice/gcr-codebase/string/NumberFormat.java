import java.util.Scanner;

public class NumberFormat {

    // Method to generate exception
    static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    // Method to handle exception
    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
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

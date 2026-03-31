import java.util.Scanner;

public class StringIndexOutOfBound {

    // Method to generate exception
    static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // invalid index
    }

    // Method to handle exception
    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // Generate exception
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated");
        }

        // Handle exception
        handleException(text);

        sc.close();
    }
}

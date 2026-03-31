public class NullPointer {

    // Method that generates NullPointerException
    static void generateException() {
        String text = null;
        System.out.println(text.length()); // Exception here
    }

    // Method that handles NullPointerException
    static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled safely");
        }
    }

    public static void main(String[] args) {

        // Step 1: Demonstrate exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception generated in generateException()");
        }

        // Step 2: Refactored version with handling
        handleException();
    }
}

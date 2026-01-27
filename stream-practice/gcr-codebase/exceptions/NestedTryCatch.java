package exceptions;
public class NestedTryCatch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int index = 2;     // change to test invalid index
        int divisor = 0;   // change to test valid division

        try {
            // Outer try: handles array access
            try {
                int value = arr[index];  // may throw ArrayIndexOutOfBoundsException

                // Inner try: handles division
                try {
                    int result = value / divisor;  // may throw ArithmeticException
                    System.out.println("Result: " + result);

                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } catch (Exception e) {
            // Safety net (optional)
        }
    }
}


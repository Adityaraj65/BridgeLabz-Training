package exceptions;

public class ExceptionPropagation {

    // Method where exception occurs
    static void method1() {
        int result = 10 / 0;   // ArithmeticException
    }

    // Method that calls method1()
    static void method2() {
        method1();             // exception propagates
    }

    public static void main(String[] args) {

        try {
            method2();         // call chain starts
        } catch (ArithmeticException e) {
            // Exception handled here
            System.out.println("Handled exception in main");
        }
    }
}


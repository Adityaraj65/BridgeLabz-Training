package junit;
public class MathUtils {

    // divide two numbers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("cannot divide by zero");
        }
        return a / b;
    }
}

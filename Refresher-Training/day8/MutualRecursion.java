package day8;

public class MutualRecursion {

    static boolean isEven(int n) {

        if (n == 0) {
            return true;
        }

        return isOdd(n - 1);
    }

    static boolean isOdd(int n) {

        if (n == 0) {
            return false;
        }

        return isEven(n - 1);
    }
    public static void main(String[] args) {

        for (int n = 0; n <= 10; n++) {
            System.out.println(n + " -> Even: " + isEven(n)
                                 + ", Odd: " + isOdd(n));
        }
    }
}

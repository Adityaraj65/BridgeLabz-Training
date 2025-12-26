import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input value of a
        System.out.println("Enter value of a");
        double a = sc.nextDouble();

        // get input value of b
        System.out.println("Enter value of b");
        double b = sc.nextDouble();

        // get input value of c
        System.out.println("Enter value of c");
        double c = sc.nextDouble();

        // calling method to find roots
        double[] roots = findRoots(a, b, c);

        // checking number of roots
        if (roots.length == 2) {
            System.out.println("Root 1 is : " + roots[0]);
            System.out.println("Root 2 is : " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Only one root is : " + roots[0]);
        } else {
            System.out.println("No real roots");
        }

        sc.close();
    }

    // method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        // calculating delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // if delta is positive then two roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }
        // if delta is zero then one root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        // if delta is negative then no real roots
        else {
            return new double[0];
        }
    }
}

import java.util.Scanner;

public class MathematicalOperation {
    public static void main(String[] args) {
        //create Scanner object
        Scanner sc = new Scanner(System.in);
        // taking input number
        System.out.println("Enter number1 ");
        int num1 = sc.nextInt();
        // creating  object
        Operation operation1 = new Operation(num1);
        //calling an instance method
        operation1.factorialOfNumber();
        operation1.isPrime();
        //get input 2 number for calculating gcd
        System.out.println("Enter 1st number to find GCD ");
        int a = sc.nextInt();
        System.out.println("enter 2nd number to find GCD");
        int b = sc.nextInt();
        //passing value a and b in gcd method
        //calling method
        operation1.gcd(a, b);
        System.out.println("Enter nth number to find Fibonacci number");
        int n = sc.nextInt();
        // calling fibonacci method
        operation1.fibonacciNumber(n);

    }
}

class Operation {
    //    instance variable
    int number1;

    //constructor
    Operation(int number1) {
        this.number1 = number1;
    }

    //calculate factorial of number
    public void factorialOfNumber() {

        if (number1 < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            return;
        }

        int fact = 1;
        for (int i = 1; i <= number1; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of a number is " + fact);
    }

    // method to check prime number
    public void isPrime() {
        if (number1 <= 1) {
            System.out.println("Given number is not prime number ");
            return;
        } else {
            for (int i = 2; i <= Math.sqrt(number1); i++) {
                if (number1 % i == 0) {
                    System.out.println(number1 + " is not a prime number ");
                    return;
                }
            }
            System.out.println(number1 + " is a prime number ");
        }
    }

    // method to calculate gcd
    public void gcd(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("GCD is " + Math.abs(a + b));
            return;
        }
        int gcdOfNum1Num2 = (Math.abs(a * b)) / lcm(Math.abs(a), Math.abs(b));
        System.out.println("GCD of two numbers is " + gcdOfNum1Num2);
    }

    public int lcm(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0) {
                break;

            }
            res++;
        }
        return res;
    }

    // calculating nth fibonacci number
    public void fibonacciNumber(int n) {
        if (n < 0) {
            System.out.println("Fibonacci is not defined for negative numbers");
            return;
        }

        if (n == 0) {
            System.out.println("Nth Fibonacci number is: 0");
            return;
        }


        int a = 0;
        int b = 1;
        int i = 1;
        while (i <= n) {
            int temp = a + b;
            a = b;
            b = temp;
            i++;

        }
        System.out.println("Nth Fibonacci number is :" + b);

    }
}

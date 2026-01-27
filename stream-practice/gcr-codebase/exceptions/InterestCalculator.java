package exceptions;

public class InterestCalculator {

    // Method that propagates exception
    static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        // throw is used to create exception explicitly
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        // Simple Interest formula
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {

        try {
            double interest = calculateInterest(10000, 2, 2);
            System.out.println("Calculated Interest: " + interest);

            // Try invalid input
            // double interest = calculateInterest(-10000, 5, 2);

        } catch (IllegalArgumentException e) {
            // Handle propagated exception
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}


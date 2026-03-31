package functional_interfaces.payment_gateway;

public interface PaymentProcessor {

    // Existing abstract method
    void processPayment(double amount);

    // New default method added later
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " is not supported by this provider.");
    }
}

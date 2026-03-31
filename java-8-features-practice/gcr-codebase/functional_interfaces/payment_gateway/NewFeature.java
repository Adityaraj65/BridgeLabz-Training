package functional_interfaces.payment_gateway;

public class NewFeature implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe processing payment of ₹" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Stripe refunded ₹" + amount);
    }
}




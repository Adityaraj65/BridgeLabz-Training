package functional_interfaces.payment_gateway;

public class PaymentAppOldFeat implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Paytm processing payment of ₹" + amount);
    }
}



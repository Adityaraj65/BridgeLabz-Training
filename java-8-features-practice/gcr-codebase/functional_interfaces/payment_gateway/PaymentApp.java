package functional_interfaces.payment_gateway;
public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor paytm = new NewFeature();
        paytm.processPayment(500);
        paytm.refund(200);

        PaymentProcessor stripe = new NewFeature();
        stripe.processPayment(1000);
        stripe.refund(400);
    }
}



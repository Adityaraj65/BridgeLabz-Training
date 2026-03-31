package ecommerce;

public class UpiPayment implements Payment {

    private boolean serverUp = true;

    @Override
    public void pay(double amount) throws PaymentFailedException {
        if (!serverUp) {
            throw new PaymentFailedException("UPI service unavailable");
        }
        System.out.println("UPI payment successful");
    }
}


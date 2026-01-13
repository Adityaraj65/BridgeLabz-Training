package ecommerce;

public class CardPayment implements Payment {

    private double cardBalance = 100000;

    @Override
    public void pay(double amount) throws PaymentFailedException {
        if (cardBalance < amount) {
            throw new PaymentFailedException("Insufficient card balance");
        }
        cardBalance -= amount;
        System.out.println("Card payment successful");
    }
}


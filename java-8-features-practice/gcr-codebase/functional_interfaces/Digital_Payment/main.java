package functional_interfaces.Digital_Payment;

public class main {
    public static void main(String[] args) {
        CreditCard c=new CreditCard();
        Upi u=new Upi();
        Wallet w=new Wallet();
        c.pay(500);
        u.pay(1000);
        u.pay(200);
        w.pay(250);

    }
}

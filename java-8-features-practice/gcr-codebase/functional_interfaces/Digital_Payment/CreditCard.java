package functional_interfaces.Digital_Payment;

public class CreditCard implements PaymentInterface{
    Double limit=1000.0;
    @Override
    public void pay(double amount) {
        if(limit>=amount){
            limit-=amount;
            System.out.println("amount paid by credit card");
        }else{
            System.out.println("sorry : limit reached");
        }
    }
}

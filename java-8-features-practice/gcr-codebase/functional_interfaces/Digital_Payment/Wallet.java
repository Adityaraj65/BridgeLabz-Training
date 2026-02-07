package functional_interfaces.Digital_Payment;

public class Wallet implements PaymentInterface{
    Double balance=1000.0;
    @Override
    public void pay(double amount) {
        if(balance>=amount){
            balance-=amount;
            System.out.println("amount paid using wallet");
        }else{
            System.out.println("sorry : insufficient balance");
        }
    }
}

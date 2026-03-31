package junit;

public class BankAccount {

    private double balance = 0;
    // add money
    public void deposit(double amount) {
        balance = balance + amount;
    }
    // withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalStateException("insufficient balance");
        }
        balance = balance - amount;
    }
    // get current balance
    public double getBalance() {
        return balance;
    }
}

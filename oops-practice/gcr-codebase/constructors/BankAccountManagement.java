
public class BankAccountManagement {

	public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1234567890L, "Rohit", 20000);
        sa.deposit(5000);
        sa.displayAccountDetails();

	}

}
class BankAccountDetail {

    public long accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccountDetail(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

class SavingsAccount extends BankAccountDetail {

    SavingsAccount(long accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber); // public
        System.out.println("Account Holder: " + accountHolder); // protected
        System.out.println("Balance: ₹" + getBalance());        // private via method
    }
}

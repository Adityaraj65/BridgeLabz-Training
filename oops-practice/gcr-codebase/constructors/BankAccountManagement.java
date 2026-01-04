package constructors;

public class BankAccountManagement {

	public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount sa = new SavingsAccount(1234567890L, "Rohit", 20000);
        sa.deposit(5000);
        sa.displayAccountDetails();

	}

}
//class BankAccount (As BankAccountDetail becasue of naming conflict)
class BankAccountDetail {

    public long accountNumber;
    protected String accountHolder;
    private double balance;
// constructor
    BankAccountDetail(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
// method to access private balance
    public double getBalance() {
        return balance;
    }
  //method to modify balance
    public void deposit(double amount) {
        balance += amount;
    }
}
// subclass SavingsAccount
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

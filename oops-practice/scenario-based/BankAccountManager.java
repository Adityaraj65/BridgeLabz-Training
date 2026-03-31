public class BankAccountManager {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC12345", 5000.0);

        account.checkBalance();
        account.deposit(2000.0);
        account.withdraw(3000.0);
        account.withdraw(6000.0); // overdraft attempt
        account.checkBalance();
    }
}

class BankAccount {

    // Fields / Properties
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method: Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successful: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method: Withdraw (Overdraft Protection)
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Withdrawal Failed: Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful: ₹" + amount);
        }
    }

    // Method: Check Balance
    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println();
    }
}

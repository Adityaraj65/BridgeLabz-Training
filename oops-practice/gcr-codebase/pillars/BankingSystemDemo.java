package pillars;

// Interface for loan-related functionality
interface Loanable {
    void applyForLoan(double amount);

    double calculateLoanEligibility();
}

// Abstract base class
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulated getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Abstract method
    public abstract double calculateInterest();
}

// Savings Account implementation
class SavingsAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account loan applied for: ₹" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 5;
    }
}

// Current Account implementation
class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.01;

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account loan applied for: ₹" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 10;
    }
}

// Main class demonstrating polymorphism
public class BankingSystemDemo {

    public static void main(String[] args) {

        BankAccount[] accounts = {
                new SavingsAccount("SA101", "Aditya", 50000),
                new CurrentAccount("CA201", "Raj Enterprises", 120000)
        };

        for (BankAccount account : accounts) {
            System.out.println("Account Holder : " + account.getHolderName());
            System.out.println("Interest Earned: ₹" + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                System.out.println("Loan Eligibility: ₹" + loanAccount.calculateLoanEligibility());
            }

            System.out.println("-----------------------------");
        }
    }
}

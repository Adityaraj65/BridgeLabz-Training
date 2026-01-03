package inheritance;

public class BankAccountTypes {
    public static void main(String[] args) {

        // Creating different types of bank accounts
        SavingsAccount sa = new SavingsAccount("SBI1121", 50000, 4.5);
        CheckingAccount ca = new CheckingAccount("SBI201", 20000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount("SBI102", 100000, 12);

        // Displaying account details
        sa.displayAccountType();
        sa.displayDetails();
        System.out.println();

        ca.displayAccountType();
        ca.displayDetails();
        System.out.println();

        fd.displayAccountType();
        fd.displayDetails();
    }
}

// Base class for all bank accounts
class BankAccount {

    // Common details for every account
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Show basic account information
    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : Rs" + balance);
    }
}

// Savings account type
class SavingsAccount extends BankAccount {

    // Extra detail only for savings account
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Tells what type of account this is
    void displayAccountType() {
        System.out.println("Account Type   : Savings Account");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}

// Checking account type
class CheckingAccount extends BankAccount {

    // Extra detail only for checking account
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type   : Checking Account");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit : Rs" + withdrawalLimit);
    }
}

// Fixed deposit account type
class FixedDepositAccount extends BankAccount {

    // Extra detail only for fixed deposit
    int tenureInMonths;

    FixedDepositAccount(String accountNumber, double balance, int tenureInMonths) {
        super(accountNumber, balance);
        this.tenureInMonths = tenureInMonths;
    }

    void displayAccountType() {
        System.out.println("Account Type   : Fixed Deposit Account");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Tenure         : " + tenureInMonths + " months");
    }
}


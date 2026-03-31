// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Abstract Parent Class
abstract class Account {
    protected int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}

// Child Class - Savings Account
class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }
}

// Child Class - Current Account
class CurrentAccount extends Account {

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}

// Abstraction using Interface
interface BankService {
    void deposit(Account account, double amount);

    void withdraw(Account account, double amount) throws InsufficientBalanceException;

    void transfer(Account from, Account to, double amount) throws InsufficientBalanceException;
}

// Implementation Class
class BankServiceImpl implements BankService {

    @Override
    public synchronized void deposit(Account account, double amount) {
        account.balance += amount;
        System.out.println("Deposited " + amount + " | Balance: " + account.getBalance());
    }

    @Override
    public synchronized void withdraw(Account account, double amount)
            throws InsufficientBalanceException {

        if (account.balance < amount) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        account.balance -= amount;
        System.out.println("Withdrawn " + amount + " | Balance: " + account.getBalance());
    }

    @Override
    public void transfer(Account from, Account to, double amount)
            throws InsufficientBalanceException {

        synchronized (from) {
            if (from.balance < amount) {
                throw new InsufficientBalanceException("Insufficient Balance for transfer");
            }
            from.balance -= amount;
        }

        synchronized (to) {
            to.balance += amount;
        }

        System.out.println("Transferred " + amount);
        System.out.println("From Balance: " + from.getBalance());
        System.out.println("To Balance  : " + to.getBalance());
    }
}

// Main Class
public class OnlineBankingSystem {

    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(101, 10000);
        Account acc2 = new CurrentAccount(102, 5000);

        BankService bankService = new BankServiceImpl();

        // Deposit
        bankService.deposit(acc1, 2000);

        // Withdraw
        try {
            bankService.withdraw(acc1, 3000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Transfer
        try {
            bankService.transfer(acc1, acc2, 2000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Polymorphism
        System.out.println("Savings Interest: " + acc1.calculateInterest());
        System.out.println("Current Interest: " + acc2.calculateInterest());

        // Multithreading Example
        Thread t1 = new Thread(() -> {
            try {
                bankService.withdraw(acc1, 1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                bankService.withdraw(acc1, 1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        t1.start();
        t2.start();
    }
}

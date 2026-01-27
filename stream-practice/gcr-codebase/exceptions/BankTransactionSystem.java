package exceptions;

public class BankTransactionSystem {

    // Custom checked exception
    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    // BankAccount class
    static class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        // Withdraw method
        public void withdraw(double amount) throws InsufficientBalanceException {

            // Unchecked exception
            if (amount < 0) {
                throw new IllegalArgumentException("Invalid amount!");
            }

            // Checked custom exception
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            }

            balance -= amount;
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }

    // Main method
    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(2000);   // test here


        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}

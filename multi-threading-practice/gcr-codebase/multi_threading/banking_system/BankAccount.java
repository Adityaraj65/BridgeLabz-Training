package multi_threading.banking_system;


import java.time.LocalDateTime;

public class BankAccount {

    private int balance = 10000;

    // Synchronized method to avoid race condition
    public synchronized boolean withdraw(String customerName, int amount) {

        System.out.println("[" + customerName + "] Attempting to withdraw " + amount
                + " at " + LocalDateTime.now());

        if (amount <= balance) {

            // Simulate processing delay
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;

            System.out.println("Transaction successful: " + customerName
                    + ", Amount: " + amount
                    + ", Balance: " + balance
                    + ", Time: " + LocalDateTime.now());

            return true;
        } else {
            System.out.println("Transaction failed: " + customerName
                    + ", Insufficient balance, Time: " + LocalDateTime.now());
            return false;
        }
    }

    public int getBalance() {
        return balance;
    }
}
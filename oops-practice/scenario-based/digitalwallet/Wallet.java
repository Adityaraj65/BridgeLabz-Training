package digitalwallet;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("ADD", amount));
    }

    public void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance!");
        }
        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount));
    }

    public double getBalance() {
        return balance;
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}


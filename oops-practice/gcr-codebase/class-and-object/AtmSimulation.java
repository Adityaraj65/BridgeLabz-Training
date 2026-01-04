package class_and_object;

public class AtmSimulation {

	public static void main(String[] args) {
        System.out.println("State of Chennai");

        BankAccount account = new BankAccount("Ravi", "ACC101", 700.0);
        account.displayBalance();
        account.deposit(200.0);
        account.withdraw(100.0);
        account.withdraw(1000.0);

	}

}
//Class Definition
class BankAccount {

 // Fields
 private String accountHolder;
 private String accountNumber;
 private double balance;

 // Constructor
 public BankAccount(String accountHolder, String accountNumber, double balance) {
     this.accountHolder = accountHolder;
     this.accountNumber = accountNumber;
     this.balance = balance;
 }


 // Method to deposit money
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: " + amount);
     displayBalance();
 }

 // Method to withdraw money
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdraw amount is : " + amount);
         displayBalance();
     } else {
         System.out.println("Insufficient balance");
     }
 }

 // Method to display balance
 public void displayBalance() {
     System.out.println("Current balance: " + balance);
 }
}

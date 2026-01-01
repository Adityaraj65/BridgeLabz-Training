public class BankAccountSystem {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
        BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.00);
        // Display account details
        System.out.println("\nAccount 1 Details:");
        account1.displayAccountDetails();
        System.out.println("\nAccount 2 Details:");
        account2.displayAccountDetails();
        // Check total accounts
        BankAccount.getTotalAccounts();
        // Deposit and withdraw operations
        System.out.println("\nPerforming transaction on account 1");
        account1.deposit(200);
        account1.withdraw(150);
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account2.deposit(100);
        account2.withdraw(800);
    }
}
// BankAccount class
class BankAccount{
    static String bankName="State Bank Of India";
    private String accountHolderName;
    private final String accountNumber;
    private static int totalAccount=0;
    private double balance;
    // Constructor
    BankAccount(String accountHolderName,String accountNumber , double balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
        totalAccount++;

    }
    // Static method to get total accounts
    public static void  getTotalAccounts(){
        System.out.println("Total number of account : "+ totalAccount);
    }
    // Method to display account details
    public void displayAccountDetails(){
        if(this instanceof BankAccount){
            System.out.println("Bank Name :"+ bankName);
            System.out.println("Account holder : "+accountHolderName);
            System.out.println("AccountNuber : "+accountNumber);
            System.out.println("Balance : "+balance);
        }else{
            System.out.println("Invalid Account instance.");
        }
    }
    // Getters and Setters
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    // Deposit and Withdraw methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println( "Deposited Rs:"+ amount);
        } else {
            System.out.println("Invalid Deposit");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawn : "+amount);
        }else{
            System.out.println("Insufficient balance ");
        }
    }
}
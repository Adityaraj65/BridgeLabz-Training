package digitalwallet;

public class Main {
    public static void main(String[] args) {

        User aditya = new User(1, "Aditya");
        User rahul = new User(2, "Rahul");

        aditya.getWallet().addMoney(1000);

        TransferService transfer = new WalletTransfer();

        try {
            transfer.transfer(aditya, rahul, 300);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Aditya Balance: " + aditya.getWallet().getBalance());
        System.out.println("Rahul Balance: " + rahul.getWallet().getBalance());

        System.out.println("\nAditya Transactions:");
        aditya.getWallet().showTransactions();
    }
}


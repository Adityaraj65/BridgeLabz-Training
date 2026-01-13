package digitalwallet;

public class BankTransfer implements TransferService {

    @Override
    public void transfer(User from, User to, double amount) throws InsufficientBalanceException {
        from.getWallet().withdrawMoney(amount);
        to.getWallet().addMoney(amount);

        System.out.println("Bank transfer successful: " + amount);
    }
}


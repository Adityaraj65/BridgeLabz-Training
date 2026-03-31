package functional_interfaces.sensitive_data_tagging;

public class TransactionDetails implements SensitiveData {

    private String cardNumber;
    private double amount;

    public TransactionDetails(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }
}


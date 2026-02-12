package lambda_expressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceObjectCreation {

    public static void main(String[] args) {

        // Step 1: Create list of transaction IDs
        List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003", "TXN1004");

        // Step 2: Convert transaction IDs into Invoice objects
        List<Invoice> invoices = transactionIds.stream().map(Invoice::new).collect(Collectors.toList());

        // Step 3: Print all invoices
        invoices.forEach(System.out::println);
    }
}


// Invoice class
class Invoice {

    private String transactionId;

    // Constructor that accepts transaction ID
    public Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    // Override toString for clean printing
    @Override
    public String toString() {
        return "Invoice created for Transaction ID: " + transactionId;
    }
}


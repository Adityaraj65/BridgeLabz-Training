package stream_api.logging_tansactions;

import java.time.LocalDateTime;
import java.util.*;

public class TransactionLogger {

    public static void main(String[] args) {
        // creating list of transaction ids
        List<String> transactionIds = new ArrayList<>();
        transactionIds.add("T1001");
        transactionIds.add("T1002");
        transactionIds.add("T1003");

        // logging each transaction with timestamp
        transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}


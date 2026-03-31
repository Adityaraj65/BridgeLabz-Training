package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
    }
    @Test
    void testDeposit() {
        account.deposit(1000);

        assertEquals(1000, account.getBalance());
    }
    @Test
    void testWithdraw() {
        account.deposit(1000);
        account.withdraw(400);

        assertEquals(600, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientBalance() {
        account.deposit(300);

        assertThrows(
                IllegalStateException.class,
                () -> account.withdraw(500)
        );
    }
}

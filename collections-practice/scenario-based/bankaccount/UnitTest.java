package bankaccount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {

    @Test
    public void test_Deposit_ValidAmount() {
        Program account = new Program(1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    public void test_Deposit_NegativeAmount() {
        Program account = new Program(1000);

        Exception exception =
                assertThrows(IllegalArgumentException.class,
                        () -> account.deposit(-200));

        assertEquals("Deposit amount cannot be negative", exception.getMessage());
    }

    @Test
    public void test_Withdraw_ValidAmount() {
        Program account = new Program(1000);
        account.withdraw(400);
        assertEquals(600, account.getBalance());
    }

    @Test
    public void test_Withdraw_InsufficientFunds() {
        Program account = new Program(500);

        Exception exception =
                assertThrows(IllegalArgumentException.class,
                        () -> account.withdraw(800));

        assertEquals("Insufficient funds.", exception.getMessage());
    }
}


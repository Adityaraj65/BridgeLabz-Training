package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(10, 5));
    }

    // 👉 Bonus: Division by zero
    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}

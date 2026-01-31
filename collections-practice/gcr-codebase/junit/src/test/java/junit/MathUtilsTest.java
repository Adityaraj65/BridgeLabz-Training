package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    void testDivideByZero() {
        assertThrows(
                ArithmeticException.class,
                () -> mathUtils.divide(10, 0)
        );
    }
}

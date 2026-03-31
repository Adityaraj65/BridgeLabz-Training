package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {
    private PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Password1"));
    }

    @Test
    void testInvalidPasswordTooShort() {
        assertFalse(validator.isValid("Pass1"));
    }

    @Test
    void testInvalidPasswordNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    void testInvalidPasswordNoDigit() {
        assertFalse(validator.isValid("Password"));
    }
}


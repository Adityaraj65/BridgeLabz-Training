package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    private UserRegistration registration = new UserRegistration();

    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(
                () -> registration.registerUser("aditya", "aditya@test.com", "secret1")
        );
    }
    @Test
    void testInvalidUsername() {
        assertThrows(
                IllegalArgumentException.class,
                () -> registration.registerUser("", "test@test.com", "secret1")
        );
    }

    @Test
    void testInvalidEmail() {
        assertThrows(
                IllegalArgumentException.class,
                () -> registration.registerUser("user", "test.com", "secret1")
        );
    }

    @Test
    void testInvalidPassword() {
        assertThrows(
                IllegalArgumentException.class,
                () -> registration.registerUser("user", "test@test.com", "123")
        );
    }
}

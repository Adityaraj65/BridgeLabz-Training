package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    @Test
    void testReverse() {
        assertEquals("avaJ", stringUtils.reverse("Java"));
    }

    @Test
    void testPalindromeTrue() {
        assertTrue(stringUtils.isPalindrome("madam"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(stringUtils.isPalindrome("java"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }
}


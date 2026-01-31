package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DateFormatterTest {

    private DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("31-01-2026", formatter.formatDate("2026-01-31"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(
                Exception.class,
                () -> formatter.formatDate("31-01-2026")
        );
    }
}


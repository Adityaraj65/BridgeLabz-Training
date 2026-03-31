package junit;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileProcessorTest {

    private FileProcessor fileProcessor;
    private Path filePath;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
        filePath = Path.of("test.txt");
    }

    @AfterEach
    void cleanUp() throws IOException {
        Files.deleteIfExists(filePath);
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        fileProcessor.writeToFile("test.txt", "hello");

        String data = fileProcessor.readFromFile("test.txt");

        assertEquals("hello", data);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile("test.txt", "data");

        assertTrue(Files.exists(filePath));
    }

    @Test
    void testReadFileNotFound() {
        assertThrows(
                IOException.class,
                () -> fileProcessor.readFromFile("missing.txt")
        );
    }
}

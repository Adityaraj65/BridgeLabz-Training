package junit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessor {

    // write data to file
    public void writeToFile(String filename, String content) throws IOException {
        Files.write(Path.of(filename), content.getBytes());
    }

    // read data from file
    public String readFromFile(String filename) throws IOException {
        return Files.readString(Path.of(filename));
    }
}

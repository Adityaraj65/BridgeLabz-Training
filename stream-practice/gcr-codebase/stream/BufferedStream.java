package stream;

import java.io.*;

public class BufferedStream{

    // 4 KB buffer size
    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {

        // Source file (large file)
        String source = "F:\\BridgeLabz-Training\\stream-practice\\gcr-codebase\\stream\\source.txt";

        // Output files
        String unbufferedDest = "unbuffered_copy.dat";
        String bufferedDest = "buffered_copy.dat";

        // Copy using normal streams
        copyUnbuffered(source, unbufferedDest);

        // Copy using buffered streams
        copyBuffered(source, bufferedDest);
    }

    // Copy file using FileInputStream and FileOutputStream
    private static void copyUnbuffered(String source, String destination) {

        byte[] buffer = new byte[BUFFER_SIZE]; // temporary memory
        long startTime = System.nanoTime();    // start time

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int bytesRead;
            // Read and write until file ends
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        long endTime = System.nanoTime(); // end time
        System.out.println("Unbuffered copy time (ns): " + (endTime - startTime));
    }

    // Copy file using BufferedInputStream and BufferedOutputStream
    private static void copyBuffered(String source, String destination) {

        byte[] buffer = new byte[BUFFER_SIZE]; // temporary memory
        long startTime = System.nanoTime();    // start time

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(destination))) {

            int bytesRead;
            // Read and write until file ends
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        long endTime = System.nanoTime(); // end time
        System.out.println("Buffered copy time (ns):   " + (endTime - startTime));
    }
}

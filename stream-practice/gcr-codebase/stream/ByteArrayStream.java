package stream;
import java.io.*;
import java.util.Arrays;

public class ByteArrayStream {

    public static void main(String[] args) {

        String inputImage = "input.jpg";
        String outputImage = "output.jpg";

        try {
            // read image file
            FileInputStream fis = new FileInputStream(inputImage);

            // ByteArrayOutputStream stores data in memory
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int bytesRead;

            // read image file and write into memory
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            fis.close();

            // convert memory data into byte array
            byte[] imageBytes = baos.toByteArray();

            // write image back
            ByteArrayInputStream bais =
                    new ByteArrayInputStream(imageBytes);

            FileOutputStream fos = new FileOutputStream(outputImage);

            // write bytes into new image file
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fos.close();

            // verify image
            byte[] originalBytes = readAllBytes(inputImage);
            byte[] newBytes = readAllBytes(outputImage);

            if (Arrays.equals(originalBytes, newBytes)) {
                System.out.println("Images are identical ");
            } else {
                System.out.println("Images are NOT identical ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // helper method to read file as byte array
    static byte[] readAllBytes(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, bytesRead);
        }

        fis.close();
        return baos.toByteArray();
    }
}

package stream;

import java.io.*;

public class PipedStream{

    public static void main(String[] args) {

        try {
            // connecting both streams
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            // writer thread
            Thread writer = new Thread(() -> {
                try {
                    String message = "Hello from Writer Thread";
                    pos.write(message.getBytes());
                    pos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // reader thread
            Thread reader = new Thread(() -> {
                try {
                    int data;
                    while ((data = pis.read()) != -1) {
                        System.out.print((char) data);
                    }
                    pis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writer.start();
            reader.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


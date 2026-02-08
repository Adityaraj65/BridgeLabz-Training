package multi_threading.download_manager;


import java.util.Random;

public class FileDownloaderThread extends Thread {

    private String fileName;
    private Random random = new Random();

    public FileDownloaderThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            for (int progress = 0; progress <= 100; progress += 25) {

                // Simulate download time
                Thread.sleep(500 + random.nextInt(500));

                System.out.println("[" + Thread.currentThread().getName() + "] Downloading "
                        + fileName + ": " + progress + "%");
            }
        } catch (InterruptedException e) {
            System.out.println("Download interrupted for " + fileName);
        }
    }
}



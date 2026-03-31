package functional_interfaces;

public class BackgroundJobExecution {

    public static void main(String[] args) {

        // Creating a Runnable using lambda expression
        Runnable backgroundTask = () -> {
            try {
                System.out.println("Background task started...");

                // Simulating long-running task
                Thread.sleep(3000);

                System.out.println("Background task completed.");
            } catch (InterruptedException e) {
                System.out.println("Background task interrupted.");
            }
        };

        // Creating a thread and passing the Runnable
        Thread workerThread = new Thread(backgroundTask);

        // Starting the background task
        workerThread.start();

        // Main thread continues execution
        System.out.println("Main thread is free to do other work.");
    }
}

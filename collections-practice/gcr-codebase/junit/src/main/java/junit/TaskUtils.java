package junit;

public class TaskUtils {

    // long task
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // wait for 3 seconds
        return "done";
    }
}

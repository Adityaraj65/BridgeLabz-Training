package multi_threading.thread_state_monitoring_system;

public class Main {
    public static void main(String[] args) {
        Thread task1 = new Thread(new TaskRunner(), "Task-1");
        Thread task2 = new Thread(new TaskRunner(), "Task-2");

        Thread monitor = new Thread(new StateMonitor(task1, task2));
        monitor.start();
        task1.start();
        task2.start();
    }
}

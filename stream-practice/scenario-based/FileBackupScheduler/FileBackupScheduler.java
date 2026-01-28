package FileBackupScheduler;
import java.util.PriorityQueue;

public class FileBackupScheduler {

    // PriorityQueue to store backup tasks
    private PriorityQueue<BackupTask> backupQueue = new PriorityQueue<>();

    // Add backup task
    public void addBackupTask(String path, int priority) {
        try {
            BackupTask task = new BackupTask(path, priority);
            backupQueue.add(task);
            System.out.println("Backup task added: " + path);
        } catch (InvalidBackupPathException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Execute all backup tasks in priority order
    public void executeBackups() {
        System.out.println("\nExecuting backup tasks:");

        while (!backupQueue.isEmpty()) {
            BackupTask task = backupQueue.poll(); // removes highest priority
            task.executeBackup();
        }
    }

    // Main method
    public static void main(String[] args) {

        FileBackupScheduler scheduler = new FileBackupScheduler();

        scheduler.addBackupTask("C:/SystemFiles", 5);   // critical
        scheduler.addBackupTask("D:/Projects", 3);
        scheduler.addBackupTask("E:/Movies", 1);
        scheduler.addBackupTask("", 4); // invalid path

        scheduler.executeBackups();
    }
}

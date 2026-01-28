package FileBackupScheduler;


// BackupTask class
class BackupTask implements Comparable<BackupTask> {

    String folderPath;
    int priority; // higher value = higher priority

    BackupTask(String folderPath, int priority) throws InvalidBackupPathException {

        // Simple validation for path
        if (folderPath == null || folderPath.isEmpty()) {
            throw new InvalidBackupPathException("Backup path is invalid!");
        }

        this.folderPath = folderPath;
        this.priority = priority;
    }

    // This method decides task order in PriorityQueue
    @Override
    public int compareTo(BackupTask other) {
        // Higher priority task should come first
        return Integer.compare(other.priority, this.priority);
    }

    // Execute backup task
    public void executeBackup() {
        System.out.println("Backing up folder: " + folderPath +
                " | Priority: " + priority);
    }
}

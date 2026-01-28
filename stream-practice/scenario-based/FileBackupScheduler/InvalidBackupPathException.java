package FileBackupScheduler;

public class InvalidBackupPathException extends RuntimeException {
    public InvalidBackupPathException(String message) {
        super(message);
    }
}

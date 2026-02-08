package functional_interfaces.data_serialization;

public class BackupProcessor {

    public static void backup(Object obj) {
        // Checking marker interface
        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Skipping backup for: " + obj.getClass().getSimpleName());
        }
    }
}


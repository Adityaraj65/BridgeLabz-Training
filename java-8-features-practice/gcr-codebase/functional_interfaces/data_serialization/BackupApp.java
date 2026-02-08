package functional_interfaces.data_serialization;

public class BackupApp {

    public static void main(String[] args) {
        CustomerData customer = new CustomerData("Aditya", 101);
        TempSessionData session = new TempSessionData("ABC123");
        BackupProcessor.backup(customer);
        BackupProcessor.backup(session);
    }
}


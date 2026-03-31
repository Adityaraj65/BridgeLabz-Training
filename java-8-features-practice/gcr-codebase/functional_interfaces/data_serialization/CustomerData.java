package functional_interfaces.data_serialization;

// This class SHOULD be backed up
public class CustomerData implements BackupSerializable {

    private String name;
    private int customerId;
    public CustomerData(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }
}

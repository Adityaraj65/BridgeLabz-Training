package functional_interfaces.sensitive_data_tagging;

public class EncryptionService {

    public static void process(Object obj) {

        // Marker interface check
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting data for: "
                    + obj.getClass().getSimpleName());
        } else {
            System.out.println("No encryption required for: "
                    + obj.getClass().getSimpleName());
        }
    }
}

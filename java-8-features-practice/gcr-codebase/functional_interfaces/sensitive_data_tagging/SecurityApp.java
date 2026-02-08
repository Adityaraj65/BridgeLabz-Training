package functional_interfaces.sensitive_data_tagging;

public class SecurityApp {

    public static void main(String[] args) {

        UserCredentials user =
                new UserCredentials("aditya", "secret123");

        String normalData = "Public Information";
        EncryptionService.process(user);
        EncryptionService.process(normalData);
    }
}


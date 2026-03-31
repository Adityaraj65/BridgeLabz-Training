package reflection.dependencies_injenction;

public class TestDI {

    public static void main(String[] args) {
        // Create Client object via DI container
        Client client = SimpleDIContainer.createObject(Client.class);
        // Use injected dependency
        client.doWork();
    }
}

package reflection.dependencies_injenction;

public class Client {

    @Inject
    private Service service;

    public void doWork() {
        service.serve();
    }
}


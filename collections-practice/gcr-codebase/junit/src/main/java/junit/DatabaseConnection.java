package junit;

public class DatabaseConnection {

    private boolean connected = false;

    // open connection
    public void connect() {
        connected = true;
    }

    // close connection
    public void disconnect() {
        connected = false;
    }

    // check connection status
    public boolean isConnected() {
        return connected;
    }
}

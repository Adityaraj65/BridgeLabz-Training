package reflection.method_execution_timing;

public class Task {

    public void fastTask() {
        for (int i = 0; i < 1000; i++) {
            // small work
        }
    }

    public void slowTask() {
        for (int i = 0; i < 1_000_000; i++) {
            // heavy work
        }
    }
}


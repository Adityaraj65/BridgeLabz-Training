package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TaskUtilsTest {

    private TaskUtils taskUtils = new TaskUtils();

    @Test
    @Timeout(3)
    void testLongRunningTaskTimeout() throws InterruptedException {
        taskUtils.longRunningTask();
    }
}


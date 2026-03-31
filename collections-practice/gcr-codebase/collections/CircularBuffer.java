package collections;

public class CircularBuffer {

    int[] buffer;
    int size;
    int start = 0;   // points to oldest element
    int count = 0;   // number of elements in buffer

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    // Insert element into circular buffer
    void insert(int value) {

        int index = (start + count) % size;

        if (count < size) {
            // Buffer not full
            buffer[index] = value;
            count++;
        } else {
            // Buffer full, overwrite oldest
            buffer[start] = value;
            start = (start + 1) % size;
        }
    }

    // Print buffer elements in correct order
    void printBuffer() {

        for (int i = 0; i < count; i++) {
            int index = (start + i) % size;
            System.out.print(buffer[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.printBuffer(); // 1 2 3

        cb.insert(4);
        cb.printBuffer(); // 2 3 4
    }
}


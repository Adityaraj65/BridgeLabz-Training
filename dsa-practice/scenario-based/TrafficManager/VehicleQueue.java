package TrafficManager;

public class VehicleQueue {
    private String[] queue;
    private int front = 0, rear = -1, size = 0;

    VehicleQueue(int capacity) {
        queue = new String[capacity];
    }

    public void enqueue(String vehicle) {
        if (size == queue.length) {
            System.out.println("Queue Overflow! Cannot add " + vehicle);
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = vehicle;
        size++;
    }

    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow! No vehicle waiting.");
            return null;
        }
        String vehicle = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return vehicle;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}


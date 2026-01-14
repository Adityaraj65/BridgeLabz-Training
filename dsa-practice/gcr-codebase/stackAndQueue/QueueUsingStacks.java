package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

class QueueUsingStacks {

    // Stack used for adding elements
    private Deque<Integer> pushStack = new ArrayDeque<>();

    // Stack used for removing elements
    private Deque<Integer> popStack = new ArrayDeque<>();

    // Enqueue operation
    public void enqueue(int data) {
        // Simply push into pushStack
        pushStack.push(data);
    }

    // Dequeue operation
    public int dequeue() {

        // If both stacks are empty → queue is empty
        if (pushStack.isEmpty() && popStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        // If popStack is empty, transfer elements
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }

        return popStack.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.dequeue()); // 20
    }
}

package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

class SortStack {

    public static void sortStack(Deque<Integer> stack) {

        // Base case: empty stack
        if (stack.isEmpty()) {
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Sort remaining stack
        sortStack(stack);

        // Insert element in sorted order
        insertSorted(stack, top);
    }

    private static void insertSorted(Deque<Integer> stack, int value) {

        // If stack is empty OR top element is smaller
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        // Otherwise remove top and try again
        int temp = stack.pop();
        insertSorted(stack, value);

        // Put back removed element
        stack.push(temp);
    }

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sortStack(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

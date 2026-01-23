package collections;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    public static void main(String[] args) {
        // Creating the Object of Stack class
        Stack<Integer> stack = new Stack<>();

        // Pushing 1,2 and 3 into stack using push method
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // Peeking the top element of the stack
        System.out.println(stack.peek());
        // Popping out element from top of the stack
        System.out.println(stack.pop());

    }
}

class Stack<T>{
    // Objects of class Queue
    Queue<T> queue1;
    Queue<T> queue2;

    // Constructor of class Stack
    public Stack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push method for Stack class to push the element into the stack
    public void push(T element){
        // Putting the element into queue2
        queue2.offer(element);
        // putting all elements of queue1 in queue2
        while(!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        // putting all elements of queue2 in queue1
        while(!queue2.isEmpty()){
            queue1.offer(queue2.poll());
        }
    }

    // Peek method of Stack class to view top element of stack
    public T peek(){
        return queue1.peek();
    }

    // Pop method of Stack class to remove the top element of stack
    public T pop(){
        return queue1.poll();
    }
}

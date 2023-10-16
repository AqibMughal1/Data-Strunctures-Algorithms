package FinalLab;

import java.util.Stack;

public class QueueWithTwoStacks<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public QueueWithTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(T item) {
        stack1.push(item);
    }

    public T dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    
}

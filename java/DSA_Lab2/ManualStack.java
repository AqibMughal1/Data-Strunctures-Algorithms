 package DSA_Lab2;

import java.util.EmptyStackException;

public class ManualStack {
    private int[] stackArray;
    private int top = -1;

    public ManualStack(int capacity) {
        stackArray = new int[capacity];
    }

    public void push(int value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        top++;
        stackArray[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int x = stackArray[top];
        top--;
        return x;
    }

    public boolean isFull() {
        return top == stackArray.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

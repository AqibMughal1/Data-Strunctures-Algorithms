package DSA_Lab5;

public class LinkedStack {
    private Node top;

    public LinkedStack() {
        top = null;
    }

    public void push(Object data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }

    }

    public Object pop() {
        if (top == null) {
            throw new IndexOutOfBoundsException();
        }
        Object data = top.getData();
        top = top.getNext();

        return data;
    }

    public Object top() {
        if (top == null) {
            throw new IndexOutOfBoundsException();
        }
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

}

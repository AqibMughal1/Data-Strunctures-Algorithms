package DSA_Lab5;

public class LinkedQueue {
    private Node front;
    private Node rear;
    private int n;

    Node newNode = new Node(front);

    public void enqueue(Node front) {
        newNode.setData(front);
        newNode.setNext(rear);
        rear = newNode;
        n++;
    }

    public void dequeue(Node rear) {
        if (rear == null) {
            throw new IndexOutOfBoundsException();
        }
        Node current = rear;
        Node previous = null;
        while (current.getNext() != rear) {
            if (current.getData().equals(rear)) {
                if (previous == null) {
                    rear = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }

                return;
            }
            previous = current;
            current = current.getNext();
        }
        if (current.getData().equals(rear)) {
            if (previous == null) {
                rear = null;
            } else {
                previous.setNext(rear);
            }

        }
    }

    public void sizeOfQueue() {
        System.out.println(n);
    }

    public boolean isEmpty() {
       return front == null;
    }

    public boolean isFull() {
        return false;
    }
}

package DSA_Lab5;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Object data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        size--;
    }

    public int size() {
        return size;
    }

    
}

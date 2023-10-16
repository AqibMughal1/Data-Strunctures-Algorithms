package DSA_Lab5;

public class CircularLinkedList {
    private Node head;

    public void insert(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.setNext(head);
        } else {
            Node current = head;
            while (current.getNext() != head) {
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setNext(head);
        }

    }

    public void delete(Object data) {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        Node previous = null;
        while (current.getNext() != head) {
            if (current.getData().equals(data)) {
                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }

                return;
            }
            previous = current;
            current = current.getNext();
        }
        if (current.getData().equals(data)) {
            if (previous == null) {
                head = null;
            } else {
                previous.setNext(head);
            }

        }

    }

    public void print() {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        while (current.getNext() != head) {
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println(current.getData());
    }
}

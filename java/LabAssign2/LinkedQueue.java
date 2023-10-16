package LabAssign2;

public class LinkedQueue {
    public Node front;
    public Node rear;
    
    public LinkedQueue() {
        front = null;
        rear = null;
    }
    
    public boolean isEmpty() {
        return front == null;
    }
    
    public void enqueue(Transaction data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    
    public Transaction dequeue() {
        if (isEmpty()) {
            return null;
        }
        Transaction data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }
    
    public class Node {
        public Transaction data;
        public Node next;
        
        public Node(Transaction data) {
            this.data = data;
            this.next = null;
        }
    }
}

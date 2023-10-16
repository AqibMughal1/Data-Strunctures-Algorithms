package DSA_Lab6;

public class Driver {
    public static void main(String[] args)
    {
        DynamicQueue q = new DynamicQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(60);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + ((q.front != null) ? (q.front).key : -1));
        System.out.println("Queue Rear : " + ((q.rear != null) ? (q.rear).key : -1));
        
    }
}

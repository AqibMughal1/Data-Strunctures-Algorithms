package DSA_Lab6;

public class DynamicQueue {
    QNode front, rear;

    public DynamicQueue(){
        this.front = this.rear = null;
    }

    public void enqueue(int key){
        QNode temp = new QNode(key);

        if(this.rear == null){
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    public void dequeue(){
        if(this.front == null){
            return;
        }

        QNode temp = this.front;
        this.front = this.front.next;

        if(this.front == null){
            this.rear = null;
        }
    }


}

package DSA_Lab4;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    
    public void Print(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public Node searchNode(int v){
        Node current = head;
        while(current != null){
            if(current.data == v){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void addAtStart(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delAtStart(int data){
        if(head == null){
            System.out.println("List is empty");
        }else{
            head = head.next;
        }      
    }

    public void delAtEnd(int data){
        if(head == null){
            System.out.println("List is empty");
        }else{
            Node current = head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
    }

    public void delAtPos(int pos){
        if(pos == 1){
            head = head.next;
        }else{
            Node current = head;
            for(int i = 1; i < pos-1; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
  
    }
}

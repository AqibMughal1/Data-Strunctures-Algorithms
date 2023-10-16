public class Linkedlist {

    //fa21-bcs-073 aqib mehmood
    Node head;

    public Linkedlist() {
        this.head = null;
    }

    boolean isEmpty(){
        return head == null;
    }

    public static void main(String[] args) {
        Node head;
        Node tail;
        int size;
    }

    void addEmployee(int id,String name){
        Node newnode = new Node( id , name);
        if(isEmpty()){
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;

            }
            curr.next = newnode;
        }

    }

    void display(int id){
        boolean found = false;
        if(isEmpty()){
            System.out.println("list is empty");
        }
        else{
            Node curr = head;
            while (curr !=null){
                if(curr.data==id){
                    System.out.println("ID="+curr.data + "Name="+ curr.name);
                    found =true;
                }
            }
            curr = curr.next;

        }
        if(found==false){
            System.out.println("Required ID not found");
        }
    }

    void removeduplicates(){
        Node curr = head.next;
        Node prev = head;

        while(curr.next!=null){
            if(prev.data==curr.data){
                prev.next= curr.next;
                curr = null;
                System.out.println("the duplicates are removed");

            }
            prev = curr;
            curr = curr.next;

        }
    }

    void print(){
        if(isEmpty()){
            System.out.println("list is empty");
        }
        Node curr = null;
        while(curr!=null){
            System.out.println("ID="+curr.data + "Name="+ curr.name);
            curr = curr.next;

        }
    }


}

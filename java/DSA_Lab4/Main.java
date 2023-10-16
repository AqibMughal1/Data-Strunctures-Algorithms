package DSA_Lab4;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addAtStart(56);
        ll.addAtStart(30);
        ll.addAtStart(70);
        ll.addAtStart(20);

        ll.addAtEnd(45);
        ll.addAtEnd(40);
        ll.addAtEnd(60);
        ll.addAtEnd(50);

        if (ll.searchNode(56) != null)
            System.out.println("The value found");
        else
            System.out.println("The value NOT found");
        
        ll.Print();
        ll.searchNode(40);
        ll.searchNode(43);
        System.out.println(ll.searchNode(340));

        ll.Print();
        System.out.println("after deletion");

        ll.delAtStart(20);
        ll.delAtEnd(50);
        ll.delAtPos(4);

        ll.Print();
    }
}

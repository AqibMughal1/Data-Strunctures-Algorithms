package DSA_Lab7;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree t = new BinarySearchTree();

        // Insert nodes into the BST
        System.out.print("Enter number of nodes to insert: ");
        int numNodes = sc.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.print("Enter node value to insert: ");
            int value = sc.nextInt();
            t.insert(new Node(value));
        }

        // Delete nodes from the BST
        System.out.print("Enter number of nodes to delete: ");
        int numDeletions = sc.nextInt();

        for (int i = 0; i < numDeletions; i++) {
            System.out.print("Enter node value to delete: ");
            int value = sc.nextInt();
            Node nodeToDelete = new Node(value);
            t.delete(nodeToDelete);
        }

        // Print out the BST in order traversal
        t.inorder(t.root);
//            t.postorder(t.root);
//            t.preorder(t.root);

        sc.close();
    }
}

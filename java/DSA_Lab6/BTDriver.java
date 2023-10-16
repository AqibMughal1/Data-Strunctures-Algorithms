package DSA_Lab6;
import java.util.Scanner;

public class BTDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();

        System.out.println("Enter the number of nodes: ");
        int n = scanner.nextInt();
        

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the data for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            tree.insert(data);
        }

        System.out.println("Inorder traversal: ");
        tree.printInorder(tree.root);

    }
}

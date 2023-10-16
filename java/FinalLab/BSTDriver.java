package FinalLab;

import java.util.Scanner;

public class BSTDriver {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        Scanner scanner = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\nBinary Search Tree Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Inorder Predecessor");
            System.out.println("3. Search");
            System.out.println("4. Print Tree");
            System.out.println("5. Delete");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to be inserted: ");
                    value = scanner.nextInt();
                    tree.insert(value);
                    break;
                case 2:
                    System.out.print("Enter the key: ");
                    value = scanner.nextInt();
                    Node predecessor = tree.findInorderPredecessor(tree.root, value);
                    if (predecessor != null)
                        System.out.println("Inorder Predecessor: " + predecessor.key);
                    else
                        System.out.println("No predecessor found.");
                    break;
                case 3:
                    System.out.print("Enter the value to be searched: ");
                    value = scanner.nextInt();
                    Node foundNode = tree.search(value);
                    if (foundNode != null)
                        System.out.println("Value found in the tree.");
                    else
                        System.out.println("Value not found in the tree.");
                    break;
                case 4:
                    System.out.println("Binary Search Tree (Inorder Traversal):");
                    tree.printTree();
                    break;
                case 5:
                    System.out.print("Enter the value to be deleted: ");
                    value = scanner.nextInt();
                    tree.delete(value);
                    System.out.println("Value deleted.");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
    
}

package DSA_Lab6;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (parent == null) {
            root = newNode;
        } else if (data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    void printPostorder(Node node) {
        if (node == null)
            return;
        // first recur on left subtree
        printPostorder(node.left);
        // then recur on right subtree
        printPostorder(node.right);
        // now deal with the node
        System.out.print(node.data + " ");
    }

    void printInorder(Node node) {
        if (node == null)
            return;
        // fi/st recur on left child
        printInorder(node.left);
        // then print the data of node
        System.out.print(node.data + " ");
        // now recur on right child
        printInorder(node.right);
    }

    void printPreorder(Node node) {
        if (node == null)
            return;

        // first print data of node
        System.out.print(node.data + " ");

        // then recur on left sutree
        printPreorder(node.left);

        // now recur on right subtree
        printPreorder(node.right);
    }

}

package FinalLab;

import java.util.Stack;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        if (root == null) {
            root = new Node(key);
            return;
        }

        Node current = root;
        Node parent;

        while (true) {
            parent = current;
            if (key < current.key) {
                current = current.left;
                if (current == null) {
                    parent.left = new Node(key);
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = new Node(key);
                    return;
                }
            }
        }
    }
    
    Node search(int key) {
        Node current = root;
        while (current != null) {
            if (key == current.key)
                return current;
            else if (key < current.key)
                current = current.left;
            else
                current = current.right;
        }
        return null;
    }

    void delete(int key) {
        Node current = root;
        Node parent = null;
        boolean isLeftChild = true;

        while (current != null && current.key != key) {
            parent = current;
            if (key < current.key) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null)
            return;

        if (current.left == null && current.right == null) {
            if (current == root)
                root = null;
            else if (isLeftChild)
                parent.left = null;
            else
                parent.right = null;
        } else if (current.right == null) {
            if (current == root)
                root = current.left;
            else if (isLeftChild)
                parent.left = current.left;
            else
                parent.right = current.left;
        } else if (current.left == null) {
            if (current == root)
                root = current.right;
            else if (isLeftChild)
                parent.left = current.right;
            else
                parent.right = current.right;
        } else {
            Node successor = getSuccessor(current);
            if (current == root)
                root = successor;
            else if (isLeftChild)
                parent.left = successor;
            else
                parent.right = successor;

            successor.left = current.left;
        }
    }

    Node getSuccessor(Node node) {
        Node successorParent = node;
        Node successor = node;
        Node current = node.right;

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }

        if (successor != node.right) {
            successorParent.left = successor.right;
            successor.right = node.right;
        }

        return successor;
    }

    Node findInorderPredecessor(Node root, int key) {
        Node predecessor = null;
        Node current = root;

        while (current != null) {
            if (current.key < key) {
                predecessor = current;
                current = current.right;
            } else
                current = current.left;
        }

        return predecessor;
    }

    void inorder() {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.key + " ");

            current = current.right;
        }
    }

    void printTree() {
        inorder();
        System.out.println();
    }


}

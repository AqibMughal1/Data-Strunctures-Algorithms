package LabAssign3;

import java.util.Stack;

class Heaptree<T extends Comparable<T>> {
    private Node<T> root;
    private Node<T> last;

    private Node<T> parent(Node<T> node) {
        if (node == root)
            return null;

        Node<T> parent = root;
        while (parent.left != node && parent.right != node) {
            parent = (parent.left != null) ? parent.left : parent.right;
        }

        return parent;
    }

    private Node<T> sibling(Node<T> node) {
        Node<T> parent = parent(node);

        if (parent == null)
            return null;

        return (parent.left == node) ? parent.right : parent.left;
    }

    private void heapifyUp(Node<T> node) {
        if (node == root)
            return;

        Node<T> parent = parent(node);
        if (parent.data.compareTo(node.data) < 0) {
            T temp = parent.data;
            parent.data = node.data;
            node.data = temp;
            heapifyUp(parent);
        }
    }

    private void heapifyDown(Node<T> node) {
        if (node.left == null && node.right == null)
            return;

        Node<T> largest = node;
        if (node.left != null && node.left.data.compareTo(largest.data) > 0)
            largest = node.left;
        if (node.right != null && node.right.data.compareTo(largest.data) > 0)
            largest = node.right;

        if (largest != node) {
            T temp = node.data;
            node.data = largest.data;
            largest.data = temp;
            heapifyDown(largest);
        }
    }

    public Heaptree() {
        this.root = null;
        this.last = null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> parent = parent(last);

        if (isEmpty())
            root = last = newNode;
        else if (root == last)
            root.left = newNode;
        else if (parent.left == last)
            parent.right = newNode;
        else {
            Node<T> curr = last;
            while (parent != root && parent.left != curr) {
                curr = parent;
                parent = parent(parent);
            }
            if (parent == root) {
                while (parent.left != null)
                    parent = parent.left;
                parent.left = newNode;
            } else if (parent.left == curr) {
                parent.right = newNode;
            }
        }
        heapifyUp(newNode);
        last = newNode;
    }

    public T remove() {
        if (isEmpty())
            throw new RuntimeException("Heap is empty!");

        T data = last.data;
        if (root == last) {
            root.destroy();
            root = last = null;
            return data;
        }

        T temp = root.data;
        root.data = last.data;
        last.data = temp;
        Node<T> parent = parent(last);
        Node<T> curr = last;

        if (parent.right == last) {
            parent.right.destroy();
            parent.right = null;
            last = parent.left;
        } else if (parent.left == last) {
            parent.left.destroy();
            parent.left = null;
            while (parent != root && parent.right != curr) {
                curr = parent;
                parent = parent(parent);
            }

            if (parent == root) {
                while (parent.right != null)
                    parent = parent.right;
                last = parent.right;
            } else if (parent.right == curr) {
                Node<T> node = sibling(curr);
                while (node.right != null)
                    parent = node.right;
                last = node.right;
            }
        }
        heapifyDown(root);
        return data;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void print() {
        Stack<Node<T>> nodeStack = new Stack<>();
        Stack<Integer> marginStack = new Stack<>();

        nodeStack.push(root);
        marginStack.push(0);

        while (!nodeStack.isEmpty()) {
            Node<T> node = nodeStack.pop();
            int marginLevel = marginStack.pop();

            for (int i = 0; i < marginLevel; i++)
                System.out.print("   ");

            System.out.print("|- ");

            if (node != null) {
                if (node.left != null || node.right != null) {
                    nodeStack.push(node.right);
                    marginStack.push(marginLevel + 1);
                    nodeStack.push(node.left);
                    marginStack.push(marginLevel + 1);
                }

                System.out.println(node.data);
            } else {
                System.out.println("NULL");
            }
        }
    }
}

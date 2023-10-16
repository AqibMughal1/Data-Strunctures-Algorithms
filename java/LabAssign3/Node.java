package LabAssign3;

class Node<T> {
    public T data;
    public Node<T> left;
    public Node<T> right;

    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void destroy() {
        if (left != null)
            left.destroy();
        if (right != null)
            right.destroy();
    }
}


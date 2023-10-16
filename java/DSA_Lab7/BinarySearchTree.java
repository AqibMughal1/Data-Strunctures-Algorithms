package DSA_Lab7;


public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node minimum(Node x) {
        while (x.left != null)
            x = x.left;
        return x;
    }
    public Node maximum(Node x) {
        while (x.right != null)
            x = x.right;
        return x;
    }
        

    public void insert(Node n) {
        Node y = null;
        Node temp = this.root;
        while (temp != null) {
            y = temp;
            if (n.data < temp.data)
                temp = temp.left;
            else
                temp = temp.right;
        }
        n.parent = y;

        if (y == null) // newly added node is root
            this.root = n;
        else if (n.data < y.data)
            y.left = n;
        else
            y.right = n;
    }

    public void transplant(Node u, Node v) {
        if (u.parent == null) // u is root
            this.root = v;
        else if (u == u.parent.left) // u is left child
            u.parent.left = v;
        else // u is right child
            u.parent.right = v;

        if (v != null)
            v.parent = u.parent;
    }

    public void delete(Node z) {
        if (z.left == null) {
            transplant(z, z.right);
        } else if (z.right == null) {
            transplant(z, z.left);
        } else {
            Node y = minimum(z.right); // minimum element in right subtree
            if (y.parent != z) {
                transplant(y, y.right);
                y.right = z.right;
                y.right.parent = y;
            }
            transplant(z, y);
            y.left = z.left;
            y.left.parent = y;
        }
    }

    public void inorder(Node n) {
        if (n != null) {
            inorder(n.left);
            System.out.println(n.data);
            inorder(n.right);
        }
    }

    public void postorder(Node n) {
        if (n != null) {
            inorder(n.left);
            inorder(n.right);
            System.out.println(n.data);
        }
    }

    public void preorder(Node n) {
        if (n != null) {
            System.out.println(n.data);
            inorder(n.left);
            inorder(n.right);
        }
    }


}

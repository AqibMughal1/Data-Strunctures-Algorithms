package Assign2;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    public Node findParent(int key) {
        return findParent(root, key);
    }

    public Node findParent(Node node, int key) {
        if (node == null) {
            return null;
        } else if ((node.left != null && node.left.data == key) ||
                   (node.right != null && node.right.data == key)) {
            return node;
        } else if (key <= node.data) {
            return findParent(node.left, key);
        } else {
            return findParent(node.right, key);
        }
    }

    public int findLevel(int key) {
        return findLevel(root, key, 0);
    }

    public int findLevel(Node node, int key, int level) {
        if (node == null) {
            return -1;
        } else if (node.data == key) {
            return level;
        } else if (key <= node.data) {
            return findLevel(node.left, key, level + 1);
        } else {
            return findLevel(node.right, key, level + 1);
        }
    }

    public Node getRoot(){
        return root;
    }

    public int findHeight() {
        return findHeight(root);
    }

    public int findHeight(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = findHeight(node.left);
            int rightHeight = findHeight(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public void printTree(Node root) {
        printTree(root, 0, false);
    }
    public void printTree() {
        printTree(root);
    }
    
    
    
    private void printTree(Node node, int level, boolean isLeft) {
        if (node == null) {
            return;
        }
        printTree(node.right, level + 1, false);
        String prefix = "";
        if (level > 0) {
            for (int i = 0; i < level - 1; i++) {
                prefix += "    ";
            }
            prefix += isLeft ? "|--- " : "|--- ";
        }
        System.out.println(prefix + node.data);
        printTree(node.left, level + 1, true);
    }
    

    public boolean isBST() {
        return isBST(root);
    }

    public boolean isBST(Node node) {
        if (node == null) {
            return true;
        } else if ((node.left != null && node.left.data > node.data) ||
                   (node.right != null && node.right.data < node.data)) {
            return false;
        } else {
            return isBST(node.left) && isBST(node.right);
        }
    }

    public boolean isSameLevel(Node root, int one, int two) {
        int levelOne = findLevel(root, one, 0);
        int levelTwo = findLevel(root, two, 0);
        return levelOne == levelTwo;
    }
    

    public int countNodes() {
        return countNodes(root);
    }

    public int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return 1 + left + right;
    }
}
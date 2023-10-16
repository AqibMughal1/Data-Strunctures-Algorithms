package LabAssign3;

public class AVLTree {
    private int key, height;
    private AVLTree left, right;
    public static final AVLTree NIL = new AVLTree();

    public AVLTree(int key) {
        this.key = key;
        left = right = NIL;
    }

    public boolean add(int key) {
        int oldSize = size();
        grow(key);
        return size() > oldSize;
    }

    public AVLTree grow(int key) {
        if (this == NIL)
            return new AVLTree(key);
        if (key == this.key)
            return this; // prevent key duplication
        if (key < this.key)
            left = left.grow(key);
        else
            right = right.grow(key);
        rebalance();
        height = 1 + Math.max(left.height, right.height);
        return this;
    }

    public int size() {
        if (this == NIL)
            return 0;
        return 1 + left.size() + right.size();
    }

    public String toString() {
        if (this == NIL)
            return "";
        return left + " " + key + " " + right;
    }

    private AVLTree() { // constructs the empty tree
        left = right = this;
        height = -1;
    }

    private AVLTree(int key, AVLTree left, AVLTree right) {
        this.key = key;
        this.left = left;
        this.right = right;
        height = 1 + Math.max(left.height, right.height);
    }

    private void rebalance() {
        if (right.height > left.height + 1) {
            if (right.left.height > right.right.height)
                right.rotateRight();
            rotateleft();
        }

        else if (left.height > right.height + 1) {
            if (left.right.height > left.left.height)
                left.rotateleft();
            rotateRight();
        }
    }

    private void rotateleft() {
        left = new AVLTree(key, left, right.left);
        key = right.key;
        right = right.right;
    }

    private void rotateRight() {
        right = new AVLTree(key, left.right, right);
        key = left.key;
        left = left.left;
    }
    public void printTree() {
        printTreeHelper(this);
    }
    
    private void printTreeHelper(AVLTree node) {
        if (node != NIL) {
            printTreeHelper(node.left);
            System.out.print(node.key + " ");
            printTreeHelper(node.right);
        }
    }

    public boolean isAVLTreeHelper(AVLTree node){
        if(node == NIL)
            return true;
        if(node.left != NIL && node.left.key > node.key)
            return false;
        if(node.right != NIL && node.right.key < node.key)
            return false;
        return isAVLTreeHelper(node.left) && isAVLTreeHelper(node.right);
    }

    public boolean isAVLTree(){
        return isAVLTreeHelper(this);
    }

    public boolean contains(int x){
        if(this == NIL)
            return false;
        if(this.key == x)
            return true;
        if(x < this.key)
            return left.contains(x);
        else
            return right.contains(x);
    }
    public AVLTree(int [] a){
        this.key = a[0];
        left = right = NIL;
        for(int i = 1; i < a.length; i++){
            this.add(a[i]);
        }
    }
}

package Assign2;

public class Main {
    public static void main(String[] args) {
        // create a binary search tree
        BinaryTree bst = new BinaryTree();
        bst.insert(64);
        bst.insert(43);
        bst.insert(81);
        bst.insert(20);
        bst.insert(55);
        bst.insert(73);
        bst.insert(91);

        // print the binary search tree
        bst.printTree();

        // test various methods on the binary search tree
        Node parent = bst.findParent(bst.getRoot(), 20);
        System.out.println("Parent of 20 is " + parent.data);

        int level = bst.findLevel(bst.getRoot(), 91, 0);
        System.out.println("Level of 91 is " + level);

        int height = bst.findHeight(bst.getRoot());
        System.out.println("Height of the binary search tree is " + height);

        boolean isBST = bst.isBST(bst.getRoot());
        System.out.println("Is the binary tree a BST? " + isBST);

        boolean sameLevel = bst.isSameLevel(bst.getRoot(), 20, 55);
        System.out.println("Are 20 and 55 at the same level? " + sameLevel);

        int count = bst.countNodes(bst.getRoot());
        System.out.println("The binary search tree has " + count + " nodes.");

    }
}



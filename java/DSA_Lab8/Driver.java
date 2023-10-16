package DSA_Lab8;

public class Driver {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree(20);
        tree.add(30);
        tree.add(40);
        tree.add(50);
        tree.add(60);
        tree.add(70);
        tree.add(80);
        System.out.println(tree);
        tree.printTree();
        System.out.println();

        System.out.println("Is that an AVL Tree: " +tree.isAVLTree());
        System.out.println("Is that tree contains 40: " +tree.contains(40));
        
        int[] arr = {100,200,300,400,500,600,700,800};
        AVLTree T2 = new AVLTree(arr);
        T2.printTree();     
    }
}

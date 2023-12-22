package udemy.tree.binary;

public class Insert {
    public static void main(String[] args) {
        BinaryTreeLL bt = new BinaryTreeLL();
        bt.insert("N1");
        bt.insert("N2");
        bt.insert("N3");
        bt.insert("N4");
        bt.insert("N5");
        bt.insert("N6");
        bt.levelOrder();
        System.out.println();
        bt.deleteBinaryTree();
        bt.levelOrder();

    }
}

package udemy.tree.binary;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    //depth first search DFS
    // pre-order traversal
    void preOrder(BinaryNode node) { // O(N), SC -> O(N)
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left); //O(N/2)
        preOrder(node.right); //O(N/2)
    }

    //in-order traversal
    void inOrder(BinaryNode node) { // O(N), SC -> O(N)
        if (node == null) {
            return;
        }
        inOrder(node.left); //O(N/2)
        System.out.print(node.value + " ");
        inOrder(node.right); //O(N/2)
    }


    //post-order traversal
    void postOrder(BinaryNode node) { // O(N), SC -> O(N)
        if (node == null) {
            return;
        }
        postOrder(node.left); //O(N/2)
        postOrder(node.right); //O(N/2)
        System.out.print(node.value + " ");
    }

    //Breadth First Search - BFS
    //level order traversal
    void levelOrder() { // O(N), SC -> O(N)
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) { // O(N)
            BinaryNode presentNode = queue.remove();   // O(1)
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

}

package udemy.tree.binary.linkedListImpl;


import java.util.LinkedList;
import java.util.Objects;
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
        if(root != null) {
            queue.add(root);
        } else {
            System.out.println("Binary Tree does not exist");
            return;
        }

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

    //search
    public void search(String value) { // O(N), SC -> O(N) -> using Queue
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) { // O(N)
            BinaryNode presentNode = queue.remove();
            if (Objects.equals(presentNode.value, value)) {
                System.out.println("The value - " + value + " is found in Tree");
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value is not found in Tree");
    }

    void insert(String value) { //TC - O(N), SC - O(N)
        //1. check if root is null
        BinaryNode newNode = new BinaryNode(); //O(1)
        newNode.value = value;

        if (root == null) {
            root = newNode;
            System.out.println("The value is inserted at the Root");
            return;
        }
        //2. if the tree exist, then we have to look for the vacant place LEVEL ORDER TRAVERSAL
        Queue<BinaryNode> queue = new LinkedList<>(); //Space Complexity - O(N)
        queue.add(root);

        while (!queue.isEmpty()) { //O(N)
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Inserted at the left");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Inserted at the right");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    //Get the deepest node
    public BinaryNode getDeepestNode() {
        //1. create a queue and add the root to the queue
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        //2. create a temp current node
        BinaryNode presentNode = null;

        while (!queue.isEmpty()) {
            presentNode = queue.remove(); // assigned the FIFO removed queue element
            if (presentNode.left != null) {
                queue.add(presentNode.left); // we are keeping on adding all existing nodes from the LEFT
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);// we are keeping on adding all existing nodes from the RIGHT
            }
        }
        return presentNode;
    }

    //Delete the deepest Node
    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        BinaryNode previousNode, presentNode = null;

        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();

            if (presentNode.left == null) {
                presentNode.right = null;
                return;
            } else if (presentNode.right == null) {
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    //Delete given Node
    void deleteNode(String value) { // TC - O(N), SC - O(N)
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                presentNode.value = getDeepestNode().value; // TC - O(N)
                deleteDeepestNode(); // TC - O(N)
                System.out.println("The node is deleted");
                return;
            } else {
                if (presentNode.left != null) queue.add(presentNode.left);
                if (presentNode.right != null) queue.add(presentNode.right);
            }
        }
        System.out.println("The value is not present in BT");
    }

    //delete entire Binary Tree
    void deleteBinaryTree() {
        root = null;
        System.out.println("Binary Tree has been deleted!");
    }

}

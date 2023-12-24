package udemy.tree.avl;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    BinaryNode root;

    public AVL(){
        this.root = null;
    }

    //get height
    public int getHeight(BinaryNode node){
        if(node == null){
            return 0;
        }
        return node.height;
    }

    //rotate right
    //      15
    //   10
    // 5
    private BinaryNode rotateRight(BinaryNode imbalancedNode){ //15 = imbalanced
        BinaryNode newRoot = imbalancedNode.left; //10
        imbalancedNode.left = imbalancedNode.left.right; //5
        newRoot.right = imbalancedNode; //15
        imbalancedNode.height = 1 + Math.max(getHeight(imbalancedNode.left), getHeight(imbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    //rotate left
    //    15
    // 5
    //    10
    private BinaryNode rotateLeft(BinaryNode imbalancedNode){ //5 is an imbalanced
        BinaryNode newRoot = imbalancedNode.right; // 10
        imbalancedNode.right = imbalancedNode.right.left;//15
        newRoot.left = imbalancedNode; //5
        imbalancedNode.height = 1 + Math.max(getHeight(imbalancedNode.left), getHeight(imbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    public int getBalance(BinaryNode node){
        if(node == null){
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    private BinaryNode insertNode(BinaryNode node, int nodeValue){
        if(node == null){
            BinaryNode newNode = new BinaryNode();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        } else if(nodeValue < node.value){
            node.left = insertNode(node.left, nodeValue);
        } else{
            node.right = insertNode(node.right, nodeValue);
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);

        if(balance > 1 && nodeValue < node.left.value){
           return rotateRight(node);
        }

        if(balance > 1 && nodeValue > node.left.value){
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if(balance < -1 && nodeValue > node.right.value){
            return rotateLeft(node);
        }

        if(balance < -1 && nodeValue < node.right.value){
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }

    public void insert(int value){
        root = insertNode(root, value);
    }

    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryNode currentNode = queue.remove();
            System.out.print(currentNode.value + " ");

            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
    }
}

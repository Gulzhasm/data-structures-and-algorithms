package leetcode.topicWise.trees;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LeafSimilar {

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val > val) {
                root = root.left;
            }
            else if (root.val < val) {
                root = root.right;
            }
            else return root;
        }

        return null;
    }

    //Input: root1 = [1,2,3], root2 = [1,3,2]
    //Output: false
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        //create Stack and store it
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack2.push(root2);
        stack1.push(root1);
        while (!stack1.empty() && !stack2.isEmpty()) {
            if (leaf(stack1) != leaf(stack2)) return false;
        }
        return stack1.empty() && stack2.isEmpty();
    }

    private int leaf(Stack<TreeNode> stack) {
        while (true) {
            TreeNode node = stack.pop();
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
            if (node.left == null && node.right == null)
                return node.val;
        }
    }
}

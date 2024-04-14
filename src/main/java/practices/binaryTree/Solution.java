package practices.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public class TreeNode {
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


    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.remove();
            if (curr.right != null) queue.add(curr.right);

            if (curr.left != null) {
                if (curr.left.left == null && curr.left.right == null) sum += curr.left.val;
                else queue.add(curr.left);
            }
        }
        return sum;
    }
}


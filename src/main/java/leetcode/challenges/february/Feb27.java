package leetcode.challenges.february;

import java.util.Stack;

public class Feb27 {


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

    //Input: root = [1,2,3,4,5]
//Output: 3
//Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
    public int diameterOfBinaryTree(TreeNode root) {
        int res = 0;
        if(root == null) return res;

        // int cur = Math.max(maxDepth(root.left), maxDepth(root.right)) + Math.min(maxDepth(root.left), maxDepth(root.right));
        int cur = maxDepth(root.left) + maxDepth(root.right);
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);

        return Math.max(cur, Math.max(left, right));
    }
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

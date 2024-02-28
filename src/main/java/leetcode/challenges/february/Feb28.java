package leetcode.challenges.february;

import java.util.LinkedList;
import java.util.Queue;

public class Feb28 {

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


    public int findBottomLeftValue(TreeNode root) {
        int ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            ans = curr.val;
            if (curr.right != null) q.offer(curr.right);
            if (curr.left != null) q.offer(curr.left);
        }
        return ans;
    }
}

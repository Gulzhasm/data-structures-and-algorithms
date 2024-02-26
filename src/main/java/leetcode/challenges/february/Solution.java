package leetcode.challenges.february;


import java.util.LinkedList;
import java.util.Queue;

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

class Solution {
    //Input: p = [1,2,3], q = [1,2,3]
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> pQ = new LinkedList<>();
        pQ.offer(p);

        Queue<TreeNode> qQ = new LinkedList<>();
        qQ.offer(q);

        while (!qQ.isEmpty() && !pQ.isEmpty()) {
            TreeNode currP = pQ.remove();
            TreeNode currQ = qQ.remove();

            if(currP == null && currQ == null) continue;
            if(currP == null || currQ == null) return false;
            if (currP.val != currQ.val) return false;

            pQ.offer(currP.left);
            pQ.offer(currP.right);
            qQ.offer(currQ.left);
            qQ.offer(currQ.right);
        }

        return qQ.isEmpty() && pQ.isEmpty();
    }
}
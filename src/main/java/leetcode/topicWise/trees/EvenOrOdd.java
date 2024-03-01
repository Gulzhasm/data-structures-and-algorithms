package leetcode.topicWise.trees;

import java.util.LinkedList;
import java.util.Queue;

public class EvenOrOdd {

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

    //Input: root = [1,10,4,3,null,7,9,12,8,6,null,null,2]
//Output: true
    public boolean isEvenOddTree(TreeNode root) {
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 0, prev = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for(int i =0; i < size; i++){
                TreeNode curr = q.remove();
                if(level%2==0 && (curr.val %2 ==0 || (i>0 && curr.val <= prev))) return false;
                if(level%2!=0 && (curr.val %2 !=0 || (i>0 && curr.val >= prev))) return false;
                prev = curr.val;

                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
            level++;
        }
        System.out.println(level);
        return true;
    }
}

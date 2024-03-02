package leetcode.topicWise.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SameLeaves {
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
    class Solution {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            Stack<TreeNode> t1 = new Stack<>();
            Stack<TreeNode> t2 = new Stack<>();
            t1.push(root1); t2.push(root2);
            while(!t1.isEmpty() && !t2.isEmpty()){
               if(dfs(t1) != dfs(t2)) return false;
            }
           return t1.isEmpty() && t2.isEmpty();
        }

        private int dfs(Stack<TreeNode> stack){
            while(true){
                TreeNode node = stack.pop();
                if(node.left != null) stack.push(node.left);
                if(node.right != null) stack.push(node.right);
                if(node.left == null && node.right == null)
                    return node.val;
            }
        }
    }
}

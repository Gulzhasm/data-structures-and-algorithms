package leetcode.topicWise.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Trees {


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

    //Input: root = [4,2,null,3,1], val = 1, depth = 3
//Output: [4,2,null,1,1,3,null,null,1]
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        //solution
        // BFS and count the depth while looping, and when you reach the depth add right and left child as val
        if (depth == 1) {
            TreeNode treeNode = new TreeNode(val);
            treeNode.left = root;
            return treeNode;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int h = 1;
        while (!queue.isEmpty() && h < depth) {
            int len = queue.size();
            h++;
            for (int i = 0; i < len; i++) {
                TreeNode curr = queue.poll();
                if (h == depth) {
                    if (curr.left != null) {
                        TreeNode tm = new TreeNode(val);
                        TreeNode t = curr.left;
                        curr.left = tm;
                        tm.left = t;
                    } else curr.left = new TreeNode(val);


                    if (curr.right != null) {
                        TreeNode tm = new TreeNode(val);
                        TreeNode t = curr.right;
                        curr.right = tm;
                        tm.right = t;
                    } else curr.right = new TreeNode(val);

                } else {
                    if (curr.left != null) queue.add(curr.left);
                    if (curr.right != null) queue.add(curr.right);
                }
            }
        }
        return root;
    }
}
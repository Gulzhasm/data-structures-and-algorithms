package algorithms.bfs;

import java.util.Queue;
import java.util.LinkedList;

public class FindSuccessor {
    // add vs offer and remove vs poll
    public TreeNode findSuccessor(TreeNode root, int key){
        if(root == null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }

            if(currentNode.val == key){
                break;
            }
        }
        return queue.peek();
    }
}

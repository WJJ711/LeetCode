import javafx.util.Pair;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;

/*class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}*/

/**
 * 迭代BFS
 */
/*public class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int res=1;
        LinkedList<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        stack.addLast(new Pair<>(root, 1));
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> temp = stack.removeFirst();
            res=temp.getValue();
            TreeNode key = temp.getKey();
            if(key.left!=null){
                stack.addLast(new Pair<>(key.left,res+1));
            }
            if(key.right!=null){
                stack.addLast(new Pair<>(key.right,res+1));
            }
        }
        return res;

    }
}*/
/**
 * 递归DFS
 */

/*
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}*/

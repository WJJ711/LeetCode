import java.util.LinkedList;
import java.util.TreeSet;

//Definition for a binary tree node.
/*class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}*/
/**
 * DFS
 */

/*
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode temp = root.right;
        root.right=invertTree(root.left);
        root.left=invertTree(temp);
        return root;
    }
}*/
/**
 * BFS
 */

/*
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return null;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.removeFirst();
            TreeNode right = cur.right;
            TreeNode left = cur.left;
            cur.left=right;
            cur.right=left;
            if(left!=null){
                queue.addLast(left);
            }
            if(right!=null){
                queue.addLast(right);
            }
        }
        return root;
    }
}*/



//Definition for a binary tree node.
/*class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}*/

/**
 * 中序遍历为有序数列
 */
/*
public class Solution530 {
    private int min=Integer.MAX_VALUE;
    private TreeNode pre=null;
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return min;
    }
    private void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        if(pre!=null){
            min=Math.min(min,root.val-pre.val);
        }
        pre=root;
        helper(root.right);
    }
}*/

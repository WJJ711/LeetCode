
//Definition for a binary tree node.
/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}



public class Solution543 {
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        getMaxDepth(root);
        return res;
    }
    public int getMaxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int right = getMaxDepth(root.right);
        int left = getMaxDepth(root.left);
        res=Math.max(right+left,res);
        return Math.max(right,left)+1;
    }
}*/

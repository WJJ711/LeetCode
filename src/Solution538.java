/*
//*Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution538 {
    int temp=0;
    public TreeNode convertBST(TreeNode root) {
        helper(root);
        return root;
    }
    private void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.right);
        root.val+=temp;
        temp=root.val;
        helper(root.left);
    }
}*/


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution404 {
    private int res=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null){
            return 0;
        }
        helper(root.left,1);
        helper(root.right,0);
        return res;
    }
    private void helper(TreeNode node,int x){
        if(node==null){
            return ;
        }
        if (node.left==null&&node.right==null&&x==1){
            res+=node.val;
            return;
        }
        helper(node.left,1);
        helper(node.right,0);
    }
}
/*

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution671 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode treeNode ;
        if(t1!=null&&t2!=null){
            treeNode=new TreeNode(t1.val+t2.val);
            treeNode.left=mergeTrees(t1.left,t2.left);
            treeNode.right=mergeTrees(t1.right,t2.right);
        }else if(t1==null){
            treeNode=t2;
        }else {
            treeNode=t1;
        }
        return treeNode;


    }
}*/

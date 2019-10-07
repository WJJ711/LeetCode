

//Definition for a binary tree node.
/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution606 {
    StringBuilder sb=new StringBuilder();
    public String tree2str(TreeNode t) {
        helper(t,null);
        if (t==null){
            return "";
        }
        return sb.substring(1,sb.length()-1).toString();
    }
    private void helper(TreeNode t,TreeNode pre){
        if(pre!=null&&pre.right!=null&&t==null){
            sb.append("(").append(")");
        }
        if (t==null){
            return;
        }
        sb.append("(").append(t.val);
        helper(t.left,t);
        helper(t.right,t);
        sb.append(")");
    }
}*/

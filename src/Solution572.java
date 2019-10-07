
//Definition for a binary tree node.
/*class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}*/

/*
import javax.swing.tree.TreeNode;

public class Solution572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null&&t==null){
            return true;
        }
        if(s==null||t==null){
            return false;
        }
        return isSame(s,t)||isSubtree(s.right,t)||isSubtree(s.left,t);
    }
    private boolean isSame(TreeNode s, TreeNode t){
        if (s==null&&t==null) {
            return true;
        }
        if (s==null||t==null){
            return false;
        }
        return s.val==t.val&&isSame(s.left,t.left)&&isSame(s.right,t.right);
    }
}*/

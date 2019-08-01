
//Definition for a binary tree node.
/*class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}*/

/**
 * 递归
 */

/*
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        int rv=root.val;
        int pv=p.val;
        int qv=q.val;
        if(qv<=rv&&rv<=pv||pv<=rv&&rv<=qv){
            return root;
        }else if(rv<qv&&rv<pv){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return lowestCommonAncestor(root.left,p,q);
        }
    }
}*/



/**
 * 迭代
 */

/*
public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root!=null){
            if(p.val<=root.val&&root.val<=q.val||q.val<=root.val&&root.val<=p.val){
                return root;
            }else if(root.val<p.val&&root.val<q.val){
                root=root.right;
            }else {
                root=root.left;
            }
        }
        return null;
    }
}
*/

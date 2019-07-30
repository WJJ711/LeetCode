import javax.swing.tree.TreeNode;
import java.util.HashMap;

//Definition for a binary tree node.
/*class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}*/
/**
 * 由底向上。回溯剪枝
 */
/*public class Solution110 {

    public boolean isBalanced(TreeNode root) {
        return getHeight(root)==-1?false:true;
    }
    *//*
    在这里剪枝只需要扫描一次
     *//*
    private int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
       int l=getHeight(root.left);
        if(l==-1){
            return -1;
        }
        //要在这里剪枝
        int r=getHeight(root.right);
        if(r==-1){
            return -1;
        }
        return Math.abs(l-r)>1?-1:Math.max(l,r)+1;

    }

}*/

/**
 * 从顶到底
 */

/*
public class Solution {
    HashMap<TreeNode, Integer> map = new HashMap<>();

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int l,r;
        if(map.containsKey(root.left)){
            l=map.get(root.left);
        }else {
            l=getHeight(root.left);
            map.put(root.left,l);
        }
        if(map.containsKey(root.right)){
            r=map.get(root.right);
        }else {
            r=getHeight(root.right);
            map.put(root.right,r);
        }

        return Math.abs(l - r) <2 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        }
    }
}*/

import java.util.ArrayList;

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
 * 中序递归,因为是二叉搜索树，所以相等的数一定是连着的
 */
/*
public class Solution501 {
    ArrayList<Integer> res = new ArrayList<>();
    int currentTime=1,maxTime=1;
    TreeNode pre=null;
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] ints = new int[res.size()];
        for (int i=0;i<res.size();i++){
            ints[i]=res.get(i);
        }
        return ints;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (pre != null) {
            if (root.val == pre.val) {
                currentTime++;
            } else {
                currentTime = 1;
            }
        }
        if (currentTime == maxTime) {
            res.add(root.val);
        }else if(currentTime>maxTime){
            res.clear();
            res.add(root.val);
            maxTime=currentTime;
        }
        pre=root;
        inorder(root.right);
    }
}*/

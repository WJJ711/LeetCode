
import java.util.*;


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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res,root,0);
        Collections.reverse(res);
        return res;

    }
    public void helper(List<List<Integer>> res,TreeNode root,int height){
        if(root==null){
            return;
        }
        if(res.size()<=height){
            res.add(new ArrayList<Integer>());
        }
        res.get(height).add(root.val);
        helper(res,root.left,height+1);
        helper(res,root.right,height+1);

    }
}*/

/**
 * 层序遍历
 */
/*
public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(null==root){
            return res;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> t= new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode node = queue.removeFirst();
                t.add(node.val);
                if(node.left!=null){
                    queue.addLast(node.left);
                }
                if(node.right!=null){
                    queue.addLast(node.right);
                }
            }
            res.add(t);

        }
        Collections.reverse(res);
        return res;
    }
}*/

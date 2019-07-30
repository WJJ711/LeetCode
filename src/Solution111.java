import javafx.util.Pair;

import java.util.LinkedList;

//Definition for a binary tree node.
/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
*/

/*
public class Solution {
    int res=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        minDepth(root,1);
        return res;
    }
    private void minDepth(TreeNode root,int height){
        if(root==null){
            return ;
        }
        if(root.right==null&&root.left==null){
            res=Math.min(res,height);
        }
        minDepth(root.left,height+1);
        minDepth(root.right,height+1);
    }
}*/


/**
 * 深度优先迭代,不减枝
 */


/*
public class Solution {
    int res=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        LinkedList<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        if(root==null){
            return 0;
        }else{
            stack.addLast(new Pair<>(root,1));
        }
        while (!stack.isEmpty()){
            Pair<TreeNode, Integer> temp = stack.removeLast();
            TreeNode key = temp.getKey();
            Integer depth = temp.getValue();
            if(key.left==null&&key.right==null){
                res=Math.min(depth,res);
            }
            if(key.right!=null){
                stack.addLast(new Pair<>(key.right,depth+1));
            }
            if(key.left!=null){
                stack.addLast(new Pair<>(key.left,depth+1));
            }
        }
        return res;
    }

}
*/

/**
 * 广度优先遍历，剪枝
 */
/*
public class Solution111 {
    public int minDepth(TreeNode root) {
       if(root==null){
           return 0;
       }
        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<>();
       queue.addLast(new Pair<>(root,1));
       while (!queue.isEmpty()){
           Pair<TreeNode, Integer> temp = queue.removeFirst();
           TreeNode key = temp.getKey();
           Integer depth = temp.getValue();
           if(key.left==null&&key.right==null){
               return depth;
           }
           if(key.right!=null){
               queue.addLast(new Pair<>(key.right,depth+1));
           }
           if(key.left!=null){
               queue.addLast(new Pair<>(key.left,depth+1));
           }
       }
       return 0;
    }

}

*/


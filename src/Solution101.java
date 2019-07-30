import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

//Definition for a binary tree node.
/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
*/

/**
 * 递归
 */
/*
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetric(root.right,root.left);
    }
    public boolean isSymmetric(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null){
            return true;
        }
        if(t1==null||t2==null){
            return false;
        }
        return t1.val==t2.val&&isSymmetric(t1.left,t2.right)&&isSymmetric(t1.right,t2.left);
    }
}*/

/**
 * 迭代
 */

/*
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        queue.addLast(root);
        while (!queue.isEmpty()){
            TreeNode t1 = queue.removeFirst();
            TreeNode t2 = queue.removeFirst();
            if(t1==null&&t2==null) {
                continue;
            }
            if (t1==null||t2==null){
                return false;
            }
            if(t1.val!=t2.val){
                return false;
            }
            queue.addLast(t1.left);
            queue.addLast(t2.right);
            queue.addLast(t1.right);
            queue.addLast(t2.left);
        }
        return true;

    }
}
*/

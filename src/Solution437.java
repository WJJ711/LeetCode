import javax.swing.tree.TreeNode;
import java.util.HashMap;

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
 * 法一：两次递归，存在大量重复计算
 */
/*
public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root==null){
            return 0;
        }
        return helper(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
    private int helper(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        int res=0;
        if(sum==root.val){
            res++;
            //可能有负数
            //return res;
        }
        res+=(helper(root.left,sum-root.val)+helper(root.right,sum-root.val));
        return res;
    }
}*/

/**
 * 回溯法
 */
/*
public class Solution437 {
    public int pathSum(TreeNode root, int sum) {
        //从根节点到当前节点的路径上，以根节点为起点，长为 key 的子序列的数量
        HashMap<Integer, Integer> map = new HashMap<>();
        return helper(root,sum,map,0);
    }
    private int helper(TreeNode root, int sum, HashMap<Integer,Integer> map,int pashNum){
        if (root==null){
            return 0;
        }
        pashNum+=root.val;
        int res=0;
        if(pashNum==sum){
            res++;
        }
        res+=map.getOrDefault(pashNum-sum,0);
        map.put(pashNum,map.getOrDefault(pashNum,0)+1);
        res=helper(root.right,sum,map,pashNum)+helper(root.left,sum,map,pashNum)+res;
        //遍历左节点的时候，把到左节点的路径给统计进去了。再遍历到右节点的时候，
        // 根节点到之前遍历的左节点的路径不满足上面的要求了，所以要把对应添加的那个计数给去掉。
        map.put(pashNum,map.getOrDefault(pashNum,0)-1);
        return res;

    }
}*/

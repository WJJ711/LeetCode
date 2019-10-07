//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}
//
///**
// * 层序遍历
// */
//public class Solution639 {
//    public List<Double> averageOfLevels(TreeNode root) {
//        ArrayList<Double> res = new ArrayList<>();
//        if (root == null) {
//            return res;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            int t = queue.size();
//            double sum = 0.0;
//            for (int i = 0; i < t; i++) {
//                TreeNode node = queue.poll();
//
//                sum += node.val;
//                if (node.left!=null){
//
//                    queue.add(node.left);
//                }
//                if (node.right!=null){
//
//                    queue.add(node.right);
//                }
//
//
//            }
//            res.add(sum / t);
//        }
//        return res;
//
//    }
//}
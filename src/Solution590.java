//import java.util.ArrayList;
//import java.util.List;
//
//// Definition for a Node.
//class Node {
//    public int val;
//    public List<Node> children;
//
//    public Node() {}
//
//    public Node(int _val,List<Node> _children) {
//        val = _val;
//        children = _children;
//    }
//};
//
//
//public class Solution590 {
//    private List<Integer> res;
//
//    public Solution590() {
//        res=new ArrayList<>();
//    }
//
//    public List<Integer> postorder(Node root) {
//        helper(root);
//        return res;
//    }
//    private void helper(Node root){
//        if (root==null){
//            return;
//        }
//        for (Node c:root.children){
//            helper(c);
//        }
//        res.add(root.val);
//    }
//}
//
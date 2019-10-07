/*
import java.util.ArrayList;
import java.util.List;


// Definition for a Node.
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

public class Solution589 {
    private List<Integer> res;

    public Solution589() {
        this.res = new ArrayList<>();
    }

    public List<Integer> preorder(Node root) {
        helper(root);
        return res;
    }
    private void helper(Node root){
        if (root==null){
            return;
        }
        res.add(root.val);
        for (Node c:root.children){
            helper(c);
        }
    }
}
*/

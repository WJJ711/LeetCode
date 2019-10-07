import java.util.List;

// Definition for a Node.
/*
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class Solution559 {
    int max=Integer.MIN_VALUE;
    public int maxDepth(Node root) {
        helper(root,1);
        return max;
    }
    private void helper(Node root,int depth){
        if (root==null){
            return ;
        }
        max=Math.max(max,depth);
        for (int i=0;i<root.children.size();i++){
            helper(root.children.get(i),depth+1);
        }
    }
}*/

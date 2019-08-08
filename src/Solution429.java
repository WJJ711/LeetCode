import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

/**
 * 法一：迭代
 */
/*
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        LinkedList<Pair<Node,Integer>> queue = new LinkedList<>();
        queue.addLast(new Pair<>(root,0));
        while (!queue.isEmpty()){
            Pair<Node, Integer> nodeIntegerPair = queue.removeFirst();
            Node node = nodeIntegerPair.getKey();
            Integer height = nodeIntegerPair.getValue();
            if(node!=null){
                List<Integer> list;
                if(res.size()>height){
                    list = res.get(height);
                }else {
                    list=new ArrayList<>();
                    res.add(list);
                }
                list.add(node.val);
                List<Node> children = node.children;
                for (Node child : children) {
                    queue.addLast(new Pair<>(child,height+1));
                }
            }
        }
        return res;
    }
}*/
/**
 * 法二：递归
 */

public class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        helper(root,0,res);
        return res;
    }
    private void helper(Node node,int depth,List<List<Integer>> res){
        if(res==null){
            return;
        }
        if(depth>=res.size()){
            res.add(new ArrayList<>());
        }
        List<Integer> list = res.get(depth);
        list.add(node.val);
        for (Node c:node.children){
            helper(c,depth+1,res);
        }
    }
}
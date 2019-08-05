import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


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
 * 法一：递归，StringBuilder
 */
/*
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList<>();
        helper(root, new StringBuffer(), paths);
        return paths;
    }

    private void helper(TreeNode root, StringBuffer path, LinkedList<String> paths) {
        if (root == null) {
            return;
        }
        path.append(root.val);
        if (root.left == null && root.right == null) {
            paths.addLast(path.toString());
        } else {
            path.append("->");
            //因为是StringBuffer类型，对象存储在堆内存，操作的是一个对象，栈内存中变量存放的是堆内存的地址
            //如果是字符串，则每次生成一个新的字符串，原字符串没有改变
            StringBuffer temp = new StringBuffer(path);
            helper(root.left, path, paths);
            helper(root.right, temp, paths);
        }
    }
}*/
/**
 * 递归，String做+法时，每次创造一个新的对象
 */
/*
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList<>();
        helper(root,"",paths);
        return paths;
    }

    private void helper(TreeNode root, String path, LinkedList<String> paths) {
        if(root==null){
            return;
        }
        path+=root.val;
        if(root.left==null&&root.right==null){
            paths.addLast(path);
        }else {
            path+="->";
            //此处不用，new 一个temp,因为字符串+会自动新建一个
            helper(root.left,path,paths);
            helper(root.right,path,paths);
        }

    }
}*/
/**
 * 迭代BFS
 */
/*
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList<>();
        LinkedList<TreeNode> node_stack=new LinkedList<>();
        LinkedList<String> path_stack=new LinkedList<>();
        if (root==null){
            return paths;
        }
        node_stack.addLast(root);
        path_stack.addLast(""+root.val);
        while (!node_stack.isEmpty()){
            TreeNode node = node_stack.removeLast();
            String path = path_stack.removeLast();
            if (node.right==null&&node.left==null){
                paths.addLast(path);
            }else {
                if(node.right!=null){
                    node_stack.addLast(node.right);
                    path_stack.addLast(path+"->"+node.right.val);
                }
                if(node.left!=null){
                    node_stack.addLast(node.left);
                    path_stack.addLast(path+"->"+node.left.val);
                }
            }
        }
        return paths;
    }
}*/

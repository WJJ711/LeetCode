


//Definition for a binary tree node.
/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums,0,nums.length-1);

    }
    private TreeNode buildBST(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=buildBST(nums,left,mid-1);
        root.right=buildBST(nums,mid+1,right);
        return root;
    }

}*/

/**
 * 投票法
 */
/*
class Solution {
    public int majorityElement(int[] nums) {
        int tar=nums[0];
        int num=1;
        for (int i=1;i<nums.length;i++){
            if(nums[i]==tar){
                num++;
            }else if(nums[i]!=tar){
                if(num>0){
                    num--;
                }else{
                    tar=nums[i];
                    num++;
                }
            }
        }
        return tar;

    }
}*/

/**
 * 分治法
 */

public class Solution169 {
    public int majorityElement(int[] nums) {
        return majorityElement(nums,0,nums.length-1);
    }
    private int majorityElement(int[] nums,int left,int right){
        if(left==right){
            return nums[left];
        }
        int mid=(left+right)>>>1;
        int l=majorityElement(nums,left,mid);
        int r=majorityElement(nums,mid+1,right);
        if(l==r){
            return l;
        }
        int countL = count(nums, l, left, right);
        int countR = count(nums, r, left, right);
        return countL>countR?l:r;
    }
    private int count(int[] nums,int tar,int left,int right){
        int res=0;
      for (int i=left;i<=right;i++){
          if(tar==nums[i]){
              res++;
          }
      }
        return res;
    }
}
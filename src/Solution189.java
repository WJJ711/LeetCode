/**
 * 法一：暴力法
 */
/*
class Solution {
    public void rotate(int[] nums, int k) {
        for (int i=0;i<k;i++){
            int temp=nums[nums.length-1];
            System.arraycopy(nums,0,nums,1,nums.length-1);
            nums[0]=temp;
        }
    }
}*/
/**
 * 法二：直接交换k个位置
 */
/*
class Solution {
    public void rotate(int[] nums, int k) {

        if(nums.length==1||k==0||(k%nums.length==0)){
            return;
        }
        int start=0;
        int cur=nums[start];
        int next=start;
        for (int i=0;i<nums.length;i++){
            next=(next+k)%nums.length;
            if(next==start){
                int temp=nums[next];
                nums[next]=cur;
                cur=temp;
                start++;
                cur=nums[start];
                next=start;
            }else{
                int temp=nums[next];
                nums[next]=cur;
                cur=temp;
            }
        }
    }
}*/



/**
 * 法三反转数组
 */

public class Solution189 {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k==0||nums.length==1){
            return;
        }
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private void reverse(int[] nums,int lo,int hi){
        for (int i=lo;i<=(lo+hi)/2;i++){
            int temp=nums[i];
            nums[i]=nums[hi-(i-lo)];
            nums[hi-(i-lo)]=temp;
        }
    }
}
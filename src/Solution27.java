import java.util.Arrays;

/**
 * 法1：双指针i，j完整遍历
 */
/*
class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i++]=nums[j];
            }
        }
        return i;
    }
}*/

/**
 * 法2：双指针i,j不完整遍历
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int t=nums.length-1;
        for(;i<=t;){
            if(nums[i]==val){
                nums[i]=nums[t];
                t--;//后面的舍弃
            }else {
                i++;
            }
        }
        return i;
    }
}
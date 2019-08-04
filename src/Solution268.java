import java.util.Arrays;
/**
 * 法一：排序
 */
/*
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]!=1){
                return i;
            }
        }
        return nums[0]==0?nums.length:0;
    }
}*/

/**
 * 异或运算,0与n异或得n
 * n与n异或得0
 */
public class Solution268 {
    public int missingNumber(int[] nums) {
        int res=nums.length;
        for (int i=0;i<nums.length;i++){
            res=res^i^nums[i];
        }
        return res;
    }
}
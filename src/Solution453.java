import java.util.Arrays;

/**
 * 排序
 */
/*
class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for (int i=nums.length-1;i>=0;i--){
            if (nums[i]==nums[0]){
                break;
            }
            ans+=nums[i]-nums[0];
        }
        return ans;
    }
}*/

/**
 * dp
 */
/*
class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for (int i=1;i<nums.length;i++){
            //这里必须加，因为nums[i]下一次就变成了nums[i-1]
            nums[i]+=res;
            int diff=nums[i]-nums[i-1];
            res+=diff;
        }
        return res;
    }
}*/

/**
 * n-1个数+1，相当于1个数减1，只需要所有数都捡到最小值即可
 */

public class Solution453 {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        int res=0;
        for (int i=0;i<nums.length;i++){
            res+=nums[i]-min;
        }
        return res;
    }
}
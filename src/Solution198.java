/**
 * 动态规划，dp[n]为第n个房子的最大值
 * 不抢第n个dp[n]=dp[n-1]
 * 抢第n个，dp[n]=nums[n]+dp[n-2]
 */
/*
class Solution {
    public int rob(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        if(nums.length<2){
            return dp[0];
        }
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i=2;i<nums.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];
    }
}*/

/**
 * 在此基础上可以优化
 */
public class Solution198 {
    public int rob(int[] nums) {
        int pre=0;
        int cur=0;
        for (int i=0;i<nums.length;i++){
            int temp=cur;
            cur=Math.max(pre+nums[i],cur);
            pre=temp;
        }
        return cur;
    }
}
/**
 * 动态规划，法一
 */
/*
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<minPrice){
                minPrice=prices[i];
                continue;
            }
            maxProfit=Math.max(maxProfit,prices[i]-minPrice);

        }
        return maxProfit;
    }
}*/

/**
 * 法二,逐渐推演,dp
 * dp[i]表示恰好第i+1天卖出股票，最多赚的钱
 * dp[i]=max(0,dp[i-1]+diff[i])
 * diff[i]表示第i+1天跟第i天的差价
 */
/*class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int[] diff = new int[prices.length - 1];
        for (int i=0;i<diff.length;i++){
            diff[i]=prices[i+1]-prices[i];
        }
        int[] dp = new int[diff.length];
        dp[0]=Math.max(diff[0],0);
        int max=Math.max(0,dp[0]);
        for (int i=1;i<dp.length;i++){
            dp[i]=Math.max(0,dp[i-1]+diff[i]);
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}*/
/**
 *推演1，因为至于前一阶段有关，故可以省略dp数组
 */
/*
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int[] diff = new int[prices.length - 1];
        for (int i=0;i<diff.length;i++){
            diff[i]=prices[i+1]-prices[i];
        }
        int last=0;
        int profit=last;
        for (int i=0;i<diff.length;i++){
            last=Math.max(0,last+diff[i]);
            profit=Math.max(profit,last);
        }
        return profit;
    }
}*/
/**
 * 推演2,两次遍历都是基于diff数组，且下一阶段也只需要用到上一阶段的diff，故可以省略diff数组
 */

public class Solution121 {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){return 0;}
        int last=0,profit=0;
        for (int i=1;i<prices.length;i++){
            last=Math.max(0,last+prices[i]-prices[i-1]);
            profit=Math.max(last,profit);
        }
        return profit;
    }
}
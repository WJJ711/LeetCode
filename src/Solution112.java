/**
 * 暴力法,超时
 */
/*
class Solution {
    public int maxProfit(int[] prices) {
        return maxProfit(prices,0);
    }

    */
/**
 * 从s开始的最大利润
 */


/*
    private int maxProfit(int[] prices, int s) {

        if(s>=prices.length){
            return 0;
        }
        int res = 0;
        for (int i = s; i < prices.length; i++) {
            int max = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    int profit = prices[j] - prices[i] + maxProfit(prices, j + 1);
                    max=Math.max(max,profit);
                }
            }
            res=Math.max(max,res);
        }
        return res;

    }
}*/

/**
 * 求峰谷值
 */

/*
class Solution {
    public int maxProfit(int[] prices) {
        int res=0,valley,peak;
        for (int i=0;i<prices.length;i++){
            while (i<prices.length-1&&prices[i+1]<=prices[i]){
                i++;
            }
            valley=i;
            while (i<prices.length-1&&prices[i+1]>=prices[i]){
                i++;
            }
            peak=i;
            res+=(prices[peak]-prices[valley]);
        }
        return res;
    }
}*/

/**
 *
 */
public class Solution112 {
    public int maxProfit(int[] prices) {
        int res=0;
        for (int i=1;i<prices.length;i++){
            res+=Math.max(0,prices[i]-prices[i-1]);
        }
        return res;
    }
}
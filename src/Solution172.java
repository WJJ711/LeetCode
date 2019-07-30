/**
 * 统计5的个数
 */
/*
class Solution {
    public int trailingZeroes(int n) {
        int res=0;
        while (n>0){
            res+=n/5;
            n/=5;
        }
        return res;
    }
}*/

/**
 * 递归
 */
public class Solution172 {
    public int trailingZeroes(int n) {
        return n==0?0:n/5+trailingZeroes(n/5);
    }
}
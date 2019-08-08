/**
 * 二分查找
 */
public class Solution441 {
    public int arrangeCoins(int n) {
        int l=0,r=n;
        while (l<r){
            int mid=(l+r+1)>>>1;
            if(cal(mid)==n){
                return mid;
            }else if (cal(mid)<n){
                l=mid;
            }else {
                r=mid-1;
            }
        }
        return l;
    }
    private long cal(int n){
        return (long)n*(n+1)/2;
    }
}
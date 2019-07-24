/**
 * 二分法
 */
public class Solution69 {
    public int mySqrt(int x) {
        long l=0;
        long r=(x>>1)+1;
        while (l<r){
            long mid=(l+r)>>>1;
            if(mid*mid==x){
                return (int) mid;
            }else if(mid*mid>x) {
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return (int) r;
    }
}



/*
class Solution {
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }
}*/

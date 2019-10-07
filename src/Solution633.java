import java.util.HashMap;

/**
 * 双指针法
 */
public class Solution633 {
    public boolean judgeSquareSum(int c) {
        int l=0,r= (int) Math.sqrt(c);
        while (l<=r){
            if (c==l*l+r*r){
                return true;
            }else if(c<l*l+r*r){
                r--;
            }else {
                l++;
            }
        }
        return false;
    }
}
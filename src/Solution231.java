/**
 * 法一：移位运算
 */
/*
class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i=0;i<31;i++){
            if(n==(1<<i)){
                return true;
            }
        }
        return false;
    }
}

*/

/**
 * 法二:n若是2的倍数，n&(n-1)=0
 */
public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        return n>1&&(n&(n-1))==0;
    }
}


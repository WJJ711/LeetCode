/*
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res=0;
        for (int i=0;i<32;i++){
            int temp=n>>i;
            temp&=1;
            res+=temp;
        }
        return res;
    }
}*/

/**
 * 法二,n&(n-1),可将最后一位1变成0,其他位不变
 */

public class Solution191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res=0;
        while (n!=0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
}
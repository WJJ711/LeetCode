/**
 * 位运算
 */
public class Solution190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0;
        for (int i=0;i<32;i++){
            int temp=n>>i;
            temp&=1;
            temp<<=(31-i);
            res|=temp;
        }
        return res;
    }
}
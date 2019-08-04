/**
 * 位运算
 * a&b<<1 为求进位
 * a^b 为求该位和
 */
public class Solution371 {
    public int getSum(int a, int b) {
        while ((a&b)!=0){
            int temp=(a&b)<<1;
            a=a^b;
            b=temp;
        }
        return a^b;
    }
}
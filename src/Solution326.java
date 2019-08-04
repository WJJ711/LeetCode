/**
 * 迭代
 */
/*
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        while (n!=1){
            if(n%3!=0){
                return false;
            }
            n/=3;
        }
        return true;
    }
}*/
/**
 * 转换成3进制,正则表达式
 */
/*
class Solution {
    public boolean isPowerOfThree(int n) {
        String string = Integer.toString(n, 3);
        //我们将使用上面的正则表达式来检查字符串是否以1 ^1 开头，后跟 0 或 多个 0 0* 并且不包含任何其他值 $
        return string.matches("^10*$");
    }
}*/

/**
 * 运算法,若是整数%整数，则是取余
 * 若是小时%1，则是求小数部分
 */
public class Solution326 {
    public boolean isPowerOfThree(int n) {
        return (Math.log10(n)/Math.log10(3))%1==0;
    }
}

/**
 * 法一:循环迭代
 */
/*
class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<1){
            return false;
        }
        while (num!=1){
            if(num%4!=0){
                return false;
            }
            num/=4;
        }
        return true;
    }
}*/
/**
 * 法二：转换成4进制，正则表达式判断
 */
/*
class Solution {
    public boolean isPowerOfFour(int num) {
        String string = Integer.toString(num, 4);
        return string.matches("^10*$");
    }
}*/
/**
 * 换底公式计算
 */
public class Solution342 {
    public boolean isPowerOfFour(int num) {
        return Math.log10(num)/Math.log10(4)%1==0;
    }
}
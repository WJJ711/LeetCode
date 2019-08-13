/**
 * 法一，计算法
 */

/*
class Solution {
    public int findComplement(int num) {
        String string = Integer.toBinaryString(num);
        int res=0;
        for (int i=0;i<string.length();i++){
            int x=string.charAt(i)=='0'?1:0;
            res=res*2+x;
        }
        return res;
    }
}*/
/**
 * 法二 异或,与1异或=取反
 */

public class Solution476 {
    public int findComplement(int num) {
        long x=1;
        while (x<=num){
            x<<=1;
        }
        x-=1;
        return (int)x^num;
    }
}
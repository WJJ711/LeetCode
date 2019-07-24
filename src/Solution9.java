/**
 * 不使用字符串
 */

public class Solution9 {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x<0||x%10==0){
            return false;
        }else{
            int rev=0;
            int temp=x;
            while (temp!=0){
                rev=rev*10+temp%10;
                temp/=10;
            }
            return x==rev;
        }
    }
}


/**
 * 使用字符串
 */
/*
class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        String s = stringBuilder.reverse().toString();
        return s.equals(String.valueOf(x));
    }
}*/

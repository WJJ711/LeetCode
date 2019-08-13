/**
 * 法一：使用正则表达式
 */
/*
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return s.matches("(\\w+)\\1+");
    }
}*/
/**
 * 法二：周期法
 */
public class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
       go: for (int k=1;k<=s.length()/2;k++){
            if(s.length()%k==0){
                for (int i=0;i+k<s.length();i++){
                    int j=i;
                    while (j+k<s.length()){
                        if(s.charAt(j)!=s.charAt(j+k)){
                            continue go;
                        }
                        j+=k;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
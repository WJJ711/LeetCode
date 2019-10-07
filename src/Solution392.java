/**
 * 双指针法
 */
public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(int i=0;i<t.length();){
            if(j==s.length()){
                return true;
            }
            if (s.charAt(j)==t.charAt(i)){
                i++;j++;
            }else {
                i++;
            }
        }
        return j==s.length()?true:false;

    }
}
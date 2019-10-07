/*
class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        String res = "";
        for (int i=0;i<s1.length;i++){
            char[] chars = s1[i].toCharArray();
            helper(chars);
            res+=new String(chars);
            if (i!=s1.length-1){
                res+=" ";
            }
        }
        return res;
    }
    private void helper(char[] chars){
        for (int i=0;i<chars.length/2;i++){
            char c=chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]=c;
        }
    }
}*/

/**
 * 使用sb
 */

public class Solution557 {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s1.length;i++){
            StringBuilder temp = new StringBuilder();
            temp.append(s1[i]);
            sb.append(temp.reverse()).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}

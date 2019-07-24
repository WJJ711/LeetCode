
/**
 * 递归
 */
public class Solution38 {
    public String countAndSay(int n) {
       if(n==1){
           return "1";
       }
        String s = countAndSay(n - 1);
       char pre=s.charAt(0);
       int count=1;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==pre){
                count++;
            }else{
                sb.append(count).append(pre);
                count=1;
                pre=s.charAt(i);
            }
       }
        sb.append(count).append(pre);
        return sb.toString();
    }
}

/**
 * 循环法
 */
/*
class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for (int i = 1; i < n; i++) {
            char pre = str.charAt(0);
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == pre) {
                    count++;
                } else {
                    sb.append(count).append(pre);
                    pre = str.charAt(j);
                    count = 1;
                }

            }
            sb.append(count).append(pre);
            str = sb.toString();
        }
        return str;
    }
}*/

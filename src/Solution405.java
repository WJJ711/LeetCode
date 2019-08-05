/**
 * 转换为16进制
 */

public class Solution405 {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        String hex ="0123456789abcdef",ans="";
        while (num!=0){
            ans=hex.charAt(num&0xf)+ans;
            //无符号右移
            num=num>>>4;
        }
        return ans;
    }
}
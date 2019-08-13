/**
 * 一次遍历
 */
public class Solution482 {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for (int i=S.length()-1;i>=0;i--){
            if(S.charAt(i)!='-'){
                sb.append(Character.toUpperCase(S.charAt(i)));
                count++;
                if(count%K==0){
                    sb.append('-');
                }
            }
        }
        if(sb.length()>=1&&sb.charAt(sb.length()-1)=='-'){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.reverse().toString();
    }
}
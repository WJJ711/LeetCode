

public class Solution541 {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i+=k){
            if(i%k==0&&(i/k&1)==0){
                helper(chars,i,Math.min(i+k-1,chars.length-1));
            }
        }
        return new String(chars);
    }
    private void helper(char[] chars,int start,int end){
        for (int i=0;i<(end+1-start)/2;i++){
            char c=chars[end-i];
            chars[end-i]=chars[start+i];
            chars[start+i]=c;
        }
    }
}
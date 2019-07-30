public class Solution168 {
    public String convertToTitle(int n) {
        StringBuffer sb=new StringBuffer();

        while (n>0){
            int mod=n%26;
            if(mod==0){
                sb.append('Z');
                n-=26;
            }
            else{
                sb.append((char)(mod-1+'A'));
            }
            n/=26;
        }

        return sb.reverse().toString();

    }
}
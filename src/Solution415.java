public class Solution415 {
    public String addStrings(String num1, String num2) {
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        StringBuilder res = new StringBuilder();
        int i=chars1.length-1,j=chars2.length-1;
        int flag=0;
        while (i>=0&&j>=0){
            int x=chars1[i]+chars2[j]-'0'-'0'+flag;
            if(x>=10){
                x-=10;
                flag=1;
            }else {
                flag=0;
            }
            res.append(x);
            i--;j--;
        }
        while (i>=0){
            int x=chars1[i]-'0'+flag;
            if(x>=10){
                x-=10;
                flag=1;
            }else {
                flag=0;
            }
            res.append(x);
            i--;
        }
        while (j>=0){
            int x=chars2[j]-'0'+flag;
            if(x>=10){
                x-=10;
                flag=1;
            }else {
                flag=0;
            }
            res.append(x);
            j--;
        }
        if (flag==1){
            res.append(1);
        }
        return res.reverse().toString();
    }
}
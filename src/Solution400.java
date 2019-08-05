public class Solution400 {
    public int findNthDigit(int n) {
        if(n<10){
            return n;
        }
        int i=0;
        while (n>Math.pow(10,i)*9*(i+1)){
            n-=Math.pow(10,i)*9*(i+1);
            i++;
        }
        i++;
        //a表示第a个数
        int a=(n-1)/i;
        //b表示第i位
        int b=(n-1)%i;
        int num= (int) (a+Math.pow(10,i-1));
        //return Integer.toString(num).charAt(b)-'0';
        for (int j=0;j<i-b-1;j++){
            num/=10;
        }
        return num%10;
    }
}
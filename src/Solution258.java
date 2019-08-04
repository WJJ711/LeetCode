public class Solution258 {
    public int addDigits(int num) {
        while (num>=10){
            num=helper(num);
        }
        return num;
    }
    private int helper(int num){
        int res=0;
        while (num!=0){
            res+=num%10;
            num/=10;
        }
        return res;
    }
}
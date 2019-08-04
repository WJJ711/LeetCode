public class Solution236 {
    public boolean isUgly(int num) {
        if(num<=0){
            return false;
        }
        if(num==1){
            return true;
        }
        while (num%3==0){
            num/=3;
        }
        while (num%5==0){
            num/=5;
        }
        return (num & (num - 1))==0;
    }
}
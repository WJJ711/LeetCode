public class Solution507 {
    public boolean checkPerfectNumber(int num) {
        int temp=1;
        double sqrt = Math.sqrt(num);
        for (int i=2;i<sqrt;i++){
            if(num%i==0){
                temp+=i;
                temp+=num/i;
            }
        }
        if(sqrt*sqrt==num){
            temp+=sqrt;
        }

        return temp==num;
    }
}
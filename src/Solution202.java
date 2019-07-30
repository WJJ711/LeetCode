import java.util.HashSet;

public class Solution202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while (n!=1){
            n=helper(n);
            if(set.contains(n)){
                return false;
            }
            set.add(n);
        }
        return true;

    }
    private int helper(int n){
        int res=0;
        while (n!=0){
            res+=(n%10)*(n%10);
            n/=10;
        }
        return res;
    }
}
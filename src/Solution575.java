import java.util.Arrays;

public class Solution575 {
    public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int res=1;
        for (int i=1;i<candies.length;i++){
            if(candies[i]!=candies[i-1]){
                if(res==candies.length/2){
                    break;
                }
                res++;

            }
        }
        return res;
    }
}
import java.util.Arrays;
import java.util.HashMap;

public class Solution506 {
    public String[] findRelativeRanks(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < temp.length; i++) {
            map.put(temp[i],temp.length-i);
        }
        String[] res = new String[nums.length];
        for (int i=0;i<nums.length;i++){
            Integer integer = map.get(nums[i]);
            if(integer.intValue()==1){
                res[i]="Gold Medal";
            }else if(integer.intValue()==2){
                res[i]="Silver Medal";
            }else if(integer.intValue()==3){
                res[i]="Bronze Medal";
            }else {
                res[i]=integer.toString();
            }

        }
        return res;

    }
}
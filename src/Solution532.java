import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * hashmap
 */
public class Solution532 {
    public int findPairs(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer> set = map.keySet();
        int count=0;
        for (int num:set){
            if(k==0){
                Integer temp = map.get(num);
                if(temp>1){

                    count++;
                }
            }else {
                if(map.containsKey(num+k)){
                    count++;
                }
            }
        }
        return count;
    }
}
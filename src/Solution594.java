import java.util.HashMap;

/**
 * 使用hashmap
 */
public class Solution594 {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res=0;
        for (Integer i : map.keySet()) {
            if (map.containsKey(i+1)){
                res=Math.max(res,map.get(i)+map.get(i+1));
            }
        }
        return res;
    }
}
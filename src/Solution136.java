import java.util.HashMap;

/**
 * 解法1：hash算法
 */
/*
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            Integer temp = map.get(nums[i]);
            temp=temp==null?1:temp+1;
            map.put(nums[i],temp);
        }
        for (Integer integer : map.keySet()) {
            if(map.get(integer)==1){
                return integer;
            }
        }
        return -1;
    }
}*/

/**
 * 异或法
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        int res=nums[0];
        for (int i=1;i<nums.length;i++){
            res^=nums[i];
        }
        return res;
    }
}
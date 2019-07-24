import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //此处不存在覆盖问题
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException();

    }
}
/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);//这里的i为数组中较大的i，比如[3,3]存储的为1
        }
        for (int i = 0; i < nums.length; i++) {//这里遍历的必须是数组，不能是map，若有重复值[3,3]则会覆盖
            int complement = target - nums[i];//这里的i从小到大遍历，从map中的value取到的是大值，所以能解出答案
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}*/


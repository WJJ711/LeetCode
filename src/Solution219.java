import java.util.HashSet;
import java.util.TreeSet;

/**
 * 平衡二叉树
 */
/*

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}*/
/**
 * hash表
 */

public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
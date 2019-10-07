import java.util.Arrays;

public class Solution628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if(nums[1]>=0){
            return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        }else {
            return Math.max(nums[0]*nums[1]*nums[nums.length-1],
                    nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
        }
    }
}
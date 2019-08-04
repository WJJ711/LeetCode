/**
 * 双指针法
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int lastNot0=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[lastNot0++]=nums[i];
            }
        }
        for (int i=lastNot0;i<nums.length;i++){
            nums[i]=0;
        }

    }
}
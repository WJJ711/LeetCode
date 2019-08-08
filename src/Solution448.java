import java.util.ArrayList;
import java.util.List;

/**
 * 法一：桶排序+异或
 */
/*
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i=0;i<nums.length;i++){
            while (nums[i]!=i+1&&nums[nums[i]-1]!=nums[i]){
                swap(nums,i,nums[i]-1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                list.add(i+1);
            }
        }
        return list;
    }
    private void swap(int[] nums,int i,int j){
        nums[i]=nums[i]^nums[j];
        nums[j]=nums[i]^nums[j];
        nums[i]=nums[i]^nums[j];
    }
}*/
/**
 * 法二：
 */
public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num:nums){
            int index=Math.abs(num)-1;
            nums[index]=-Math.abs(nums[index]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }

}
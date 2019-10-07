import java.util.Arrays;

public class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i=0;i<temp.length;i++){
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        int lo,hi;
        int i=0;
        while (i<nums.length){
            if(temp[i]!=nums[i]){
                break;
            }
            i++;
        }
        lo=i;
        int j=nums.length-1;
        while (j>i){
            if(temp[j]!=nums[j]){
                hi=j;
                break;
            }
            j--;
        }
        hi=j;
        return hi-lo+1;

    }
}
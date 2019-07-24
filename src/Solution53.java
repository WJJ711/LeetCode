import java.util.Arrays;

/**
 * dp
 */
/*class Solution {
    public int maxSubArray(int[] nums) {
        int[] d = new int[nums.length];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(i==0||d[i-1]<0){
                d[i]=nums[i];
            }else{
                d[i]=d[i-1]+nums[i];
            }
          max=Math.max(d[i],max);
        }
        return max;
    }
}*/

/**
 * 分治法divideandconquer
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        return devide(nums,0,nums.length-1);
    }

    public int devide(int[] nums,int left,int right){
        if(left==right) {
            return nums[left];
        }
        int mid=(left+right)>>>1;
        return Math.max(devide(nums,left,mid),Math.max(devide(nums,mid+1,right),conquer(nums,left,mid,right)));
    }
    public int conquer(int[] nums,int left,int mid,int right){
        int leftMax=Integer.MIN_VALUE;
        int sum=0;
        for(int i=mid;i>=left;i--){
            sum+=nums[i];
            leftMax=Math.max(leftMax,sum);
        }
        sum=0;
        int rightMax=Integer.MIN_VALUE;
        for (int i=mid+1;i<=right;i++){
            sum+=nums[i];
            rightMax=Math.max(rightMax,sum);
        }
        return leftMax+rightMax;
    }
}

public class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        double now=0.0;

        for (int i=0;i<k;i++){
            now+=nums[i];
        }
        double max=now;

        for (int i=0;i+k<nums.length;i++){
            now+=nums[i+k];
            now-=nums[i];
            max=Math.max(max,now);
        }
        return max/k;
    }
}
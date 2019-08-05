import java.util.PriorityQueue;

/**
 * 法一：堆排序
 */
/*
class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int max=nums[0];
        for (int i=0;i<nums.length;i++){
            if((heap.size()<3||nums[i]>heap.peek())&&!heap.contains(nums[i])){
                heap.add(nums[i]);
                if(heap.size()>3){
                    heap.poll();
                }
            }
            max=Math.max(max,nums[i]);
        }
        return heap.size()==3?heap.peek():max;
    }
}*/

/**
 * 法二：3个数
 */
public class Solution414 {
    public int thirdMax(int[] nums) {
        long first=Long.MIN_VALUE,second=Long.MIN_VALUE,third=Long.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>first){
                third=second;
                second=first;
                first=nums[i];
            }else if(nums[i]<first&&nums[i]>second){
                third=second;
                second=nums[i];
            }else if(nums[i]<second&&nums[i]>third){
                third=nums[i];
            }
        }
        return (int) (third==Long.MIN_VALUE?first:third);
    }
}

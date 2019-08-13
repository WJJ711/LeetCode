import java.util.HashMap;
import java.util.Stack;

/**
 * 单调栈 ,反向遍历
 */
public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=nums2.length-1;i>=0;i--){
            while (!stack.isEmpty()&&stack.peek()<=nums2[i]){
                //如果栈顶元素比nums2[i]小，则说明，会被nums2[i]挡住
                stack.pop();
            }
            //不为空说明,栈顶是第一个比该元素大的
            if(!stack.isEmpty()){
                map.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
        int[] ints = new int[nums1.length];
        for (int i=0;i<ints.length;i++){
            ints[i]=map.getOrDefault(nums1[i],-1);
        }
        return ints;
    }
}
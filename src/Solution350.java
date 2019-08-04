import java.util.Arrays;
import java.util.HashMap;

/**
 * 法一：hashmap存储数和出现的个数
 */
/*
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        int[] ints = new int[nums1.length];
        int j=0;
        for (int i : nums2) {
            if(map.containsKey(i)&&map.get(i)>0){
                ints[j++]=i;
                map.put(i,map.get(i)-1);
            }
        }
        return Arrays.copyOf(ints,j);
    }
}*/

/**
 * 排序
 */
public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] res = new int[nums1.length];
        int k=0;
        for (int i=0,j=0;i<nums1.length&&j<nums2.length;){
            if(nums1[i]==nums2[j]){
                res[k++]=nums1[i];
                i++;j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else {
                j++;
            }
        }
        return Arrays.copyOf(res,k);
    }
}
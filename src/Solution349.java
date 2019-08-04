import java.util.*;
/**
 * 法一：两个set
 */
/*
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> list = new HashSet<>();
        for (int i=0;i<nums1.length;i++) {
            set.add(nums1[i]);
        }
        for (int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
            }
        }
        int[] ints = new int[list.size()];
        Iterator<Integer> iterator = list.iterator();
        for (int i=0;i<ints.length;i++){
            ints[i]=iterator.next();
        }
        return ints;
    }
}*/

/**
 * 法二，java中内置函数，retainAll表示取交集
 */

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        set1.retainAll(set2);
        int[] res = new int[set1.size()];
        int i=0;
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()){
            res[i++]=iterator.next();
        }
        return res;
    }
}
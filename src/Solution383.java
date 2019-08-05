import java.util.HashMap;
/**
 * 法一：map
 */
/*
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<magazine.length();i++){
            if (map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }else {
                map.put(magazine.charAt(i),1);
            }
        }
        for (int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(!map.containsKey(c)){
                return false;
            }else {
                if(map.get(c)==0){
                    return false;
                }else {
                    map.put(c,map.get(c)-1);
                }
            }
        }
        return true;
    }
}*/

/**
 * 法二：数组
 */
public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a = new int[26];
        char[] chars = magazine.toCharArray();
        for (char aChar : chars) {
            a[aChar-'a']++;
        }
        char[] array = ransomNote.toCharArray();
        for (char c : array) {
            if(a[c-'a']==0){
                return false;
            }
            a[c-'a']--;
        }
        return true;
    }
}
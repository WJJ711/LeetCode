import java.util.HashMap;

/**
 * 法一,hashmap
 */
/*
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }else {
                if(map.containsValue(t.charAt(i))){
                    return false;
                }else {
                    map.put(s.charAt(i),t.charAt(i));
                }
            }
        }
        return true;
    }
}*/

/**
 * 法二，索引法
 */
public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        int[] ss = new int[128];
        int[] tt = new int[128];
        for (int i=0;i<s.length();i++){
            ss[s.charAt(i)]+=i;
            tt[t.charAt(i)]+=i;
            if(ss[s.charAt(i)]!=tt[t.charAt(i)]){
                return false;
            }
        }
        return true;

    }
}
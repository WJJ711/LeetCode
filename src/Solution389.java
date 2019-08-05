import java.util.HashMap;

/**
 * map计数法
 * <p>
 * 法二：字符串替换法
 * <p>
 * 法三：ascii码相减法
 */
/*
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars1 = s.toCharArray();
        for (char c : chars1) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        char[] chars2 = t.toCharArray();
        for (char c : chars2) {
            if(!map.containsKey(c)){
                return c;
            }else {
                map.put(c,map.get(c)-1);
            }
        }
        for (Character c : map.keySet()) {
            if(map.get(c)==-1){
                return c;
            }
        }
        return 'a';
    }
}*/

/**
 * 法二：字符串替换法
 */
/*
class Solution {
    public char findTheDifference(String s, String t) {
        for (Character c:s.toCharArray()){
            t=t.replaceFirst(c.toString(),"");
        }
        return t.toCharArray()[0];
    }
}*/

/**
 * 法三：ascii码相减法
 */
/*
class Solution {
    public char findTheDifference(String s, String t) {
        int res=0;
        for (char c:s.toCharArray()){
            res-=c;
        }
        for (char c:t.toCharArray()){
            res+=c;
        }
        return (char)res;
    }
}*/

/**
 * 法四：亦或法
 */
public class Solution389 {
    public char findTheDifference(String s, String t) {
        int res = 0;
        for (char c : s.toCharArray()) {
           res^=c;
        }
        for (char c:t.toCharArray()){
            res^=c;
        }
        return (char)res;
    }
}
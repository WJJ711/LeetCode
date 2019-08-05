import java.util.HashMap;

public class Solution387 {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            map.put(aChar,map.getOrDefault(aChar,0)+1);
        }
        for (int i=0;i<chars.length;i++){
            if(map.containsKey(chars[i])&&map.get(chars[i])==1){
                return i;
            }
        }
        return -1;
    }
}
import java.util.HashMap;

public class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if(pattern.length()!=s.length){
            return false;
        }
        for (int i=0;i<s.length;i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(s[i])){
                    return false;
                }
            }else {
                if(map.containsValue(s[i])){
                    return false;
                }else {
                    map.put(pattern.charAt(i),s[i]);
                }
            }
        }
        return true;
    }
}
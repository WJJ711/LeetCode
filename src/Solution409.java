import java.util.HashMap;

/**
 * hashmap
 */
public class Solution409 {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int res=0;
        boolean flag=false;
        for (Character c : map.keySet()) {
            if(map.get(c)%2==0){
                res+=map.get(c);
            }else {
                flag=true;
                res+=map.get(c)/2*2;
            }
        }
        return flag?res+1:res;
    }
}
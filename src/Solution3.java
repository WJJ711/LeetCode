import java.util.HashMap;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> windows = new HashMap<>();
        int l = 0, r = 0;
        int res = 0;
        while (r < s.length()) {
            windows.put(s.charAt(r), windows.getOrDefault(s.charAt(r), 0) + 1);
            while (windows.get(s.charAt(r))>1) {
                windows.put(s.charAt(l),windows.get(s.charAt(l))-1);
                l++;
            }
            r++;
            res=Math.max(res,r-l);

        }
        return res;
    }
}
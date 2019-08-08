import com.sun.java.swing.plaf.windows.resources.windows;

import java.util.HashMap;

/**
 * 滑动窗口法
 */
public class Solution76 {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        for (int i=0;i<t.length();i++){
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }
        int formed=0;
        int l=0,r=0;
        int[] ans={Integer.MAX_VALUE,0,0};
        HashMap<Character, Integer> windows = new HashMap<>();
        while (r<s.length()){
            if(need.containsKey(s.charAt(r))){
                windows.put(s.charAt(r),windows.getOrDefault(s.charAt(r),0)+1);
                if(windows.get(s.charAt(r)).equals(need.get(s.charAt(r)))){
                    formed++;
                }
            }
            r++;
            while (formed==need.size()){
                if(r-l<ans[0]){
                    ans[0]=r-l;
                    ans[1]=l;
                    ans[2]=r;
                }
                if(windows.containsKey(s.charAt(l))){
                    windows.put(s.charAt(l),windows.get(s.charAt(l))-1);
                    if(windows.get(s.charAt(l))<need.get(s.charAt(l))){
                        formed--;
                    }
                }
                l++;
            }
        }
        return s.substring(ans[1],ans[2]);
    }
}
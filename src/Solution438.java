import java.util.*;

/**
 * 双指针，滑块
 */
/*
public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        if(s.length()<p.length()){
            return list;
        }
        int[] a = new int[26];
        int[] b = new int[26];
        for (int i = 0; i < p.length(); i++) {
            a[s.charAt(i) - 'a']++;
            b[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(a,b)){
            list.add(0);
        }
        int left=0,right=p.length();
        while (right<s.length()){
            a[s.charAt(left++)-'a']--;
            a[s.charAt(right++)-'a']++;
            if(Arrays.equals(a,b)){
                list.add(left);
            }
        }
        return list;
    }
}*/

/**
 * 法二：窗口滑块法，模板
 */
public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> need = new HashMap<>();
        for (char c:p.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int l=0,r=0;
        int match=0;
        HashMap<Character, Integer> windows = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        while (r<s.length()){
            char c = s.charAt(r);
            if(need.containsKey(c)){
                windows.put(c,windows.getOrDefault(c,0)+1);
                if(windows.get(c).equals(need.get(c))){
                    match++;
                }
            }
            r++;
            while (match==need.size()){
                if(r-l==p.length()){
                    res.add(l);
                }
                if(windows.containsKey(s.charAt(l))){
                   windows.put(s.charAt(l),windows.get(s.charAt(l))-1);
                   if(windows.get(s.charAt(l))<need.get(s.charAt(l))){
                       match--;
                   }
                }
                l++;
            }
        }
        return res;
    }

}
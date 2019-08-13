import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 建立hash表
 */
public class Solution500 {
    public String[] findWords(String[] words) {
        String key="qwertyuiop asdfghjkl zxcvbnm";
        HashMap<Character, Integer> map = new HashMap<>();
        String[] keys = key.split(" ");
        for (int i=0;i<keys.length;i++){
            for (int j=0;j<keys[i].length();j++){
                map.put(keys[i].charAt(j),i);
            }
        }
        ArrayList<String> strings = new ArrayList<>();
        for (String word : words) {
            if(word.length()==1){
                strings.add(word);
                continue;
            }
            for (int i=1;i<word.length();i++){
                if(map.get(Character.toLowerCase(word.charAt(i))).intValue()!=map.get(Character.toLowerCase(word.charAt(i-1)))){
                    break;
                }else if(i==word.length()-1){
                    strings.add(word);
                }
            }
        }
        String[] res = new String[strings.size()];
        for (int i=0;i<res.length;i++){
            res[i]=strings.get(i);
        }
        return res;
    }
}
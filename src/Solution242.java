import com.sun.org.apache.bcel.internal.generic.NEW;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] ints = new int[128];
        for (int i=0;i<s.length();i++){
            ints[s.charAt(i)]++;
            ints[t.charAt(i)]--;
        }
        for (int i='a';i<='z';i++){
            if (ints[i]!=0){
                return false;
            }
        }
        return true;
    }
}
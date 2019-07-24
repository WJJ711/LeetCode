


public class Solution953 {
    public boolean isAlienSorted(String[] words, String order) {
        flag:for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];
            int j;
            for (j = 0; j < s1.length() && j < s2.length(); j++) {
                if (order.indexOf(s1.charAt(j)) > order.indexOf(s2.charAt(j))) {
                    return false;
                }
                if(order.indexOf(s1.charAt(j)) < order.indexOf(s2.charAt(j))){
                    continue flag;
                }
            }
            if(j<s1.length()&&j==s2.length()){
                return false;
            }
        }
        return true;
    }
}
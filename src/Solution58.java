public class Solution58 {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i = s.lastIndexOf(" ");
        return s.length()-i-1;
    }
}

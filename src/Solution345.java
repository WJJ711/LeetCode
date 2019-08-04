
public class Solution345 {
    public String reverseVowels(String s) {
        if(s==null||s.equals("")){
            return "";
        }
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        do {
            while (i < j && !isYuanYin(chars[i])) {
                i++;
            }
            while (i < j && !isYuanYin(chars[j])) {
                j--;
            }
            char temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;
            j--;
            i++;

        } while (i < j);
        return new String(chars);
    }

    private boolean isYuanYin(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

            return true;
        }
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
}
public class Solution123 {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while (i<j){
            while (!Character.isLetterOrDigit(s.charAt(i))&&i<j){
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j))&&i<j){
                j--;
            }
            if(Character.toUpperCase(s.charAt(i))!=Character.toUpperCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
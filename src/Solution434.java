public class Solution434 {
    public int countSegments(String s) {
        s = s.trim();
        String[] strings = s.split(" ");
        int res = 0;
        for (String string : strings) {
            if (string.trim().length() > 0) {
                res++;
            }
        }
        return res;
    }
}
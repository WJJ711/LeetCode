public class Solution67 {
    public String addBinary(String a, String b) {
        int x = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int temp = x;
            temp += i < 0 ? 0 : a.charAt(i) - '0';
            temp += j < 0 ? 0 : b.charAt(j) - '0';
            x = temp >> 1;
            sb.append(temp % 2);
        }
        if (x == 1) {
            sb.append(x);
        }
        return sb.reverse().toString();
    }
}
import java.util.regex.Matcher;

public class Solution461 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
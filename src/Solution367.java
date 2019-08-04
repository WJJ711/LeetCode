public class Solution367 {
    public boolean isPerfectSquare(int num) {
        int x= (int) Math.sqrt(num);
        return x*x==num;
    }
}
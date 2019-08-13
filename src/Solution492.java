public class Solution492 {
    public int[] constructRectangle(int area) {
        int L= (int) Math.sqrt(area);
        int W=L;
        while (W*L!=area){
            if(W*L<area){
                L++;
            }else {
                W--;
            }
        }
        return new int[]{L,W};
    }
}
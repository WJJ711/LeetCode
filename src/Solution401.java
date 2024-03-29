import java.util.ArrayList;
import java.util.List;

public class Solution401 {
    public List<String> readBinaryWatch(int num) {
        ArrayList<String> res = new ArrayList<>();
        for (int i=0;i<12;i++){
            for (int j=0;j<60;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j)==num){
                    res.add(String.format("%d:%02d",i,j));
                }
            }
        }
        return res;
    }
}
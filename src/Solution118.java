import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();

        for(int i=0;i<numRows;i++){
            ArrayList<Integer> list = new ArrayList<>(i+1);
            list.add(1);
            for (int j=1;j<i;j++){
                if(i>1){
                    List<Integer> pre = res.get(i - 1);
                    list.add(pre.get(j-1)+pre.get(j));
                }
            }
            if(i>0){

                list.add(1);
            }
            res.add(list);
        }
        return res;
    }
}
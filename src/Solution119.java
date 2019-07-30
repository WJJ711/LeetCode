import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 迭代
 */
/*
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>(rowIndex + 1);
        list.add(1);
        if (rowIndex == 0) {
            return list;
        }
        for (int i = 1; i < rowIndex + 1; i++) {
            list.add(0);
        }
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
        }
        return list;
    }
}*/

/**
 * 通项公式
 */
public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>(rowIndex + 1);
        list.add(1);
        if(rowIndex==0){
            return list;
        }

        for (int i=1;i<=rowIndex;i++){
            long temp=(long)list.get(i-1)*(rowIndex-i+1)/i;
            list.add((int)temp);
        }
        return list;
    }
}
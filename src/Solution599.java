
import java.util.ArrayList;
import java.util.HashMap;

public class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        for (int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        for (int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                int temp = map.get(list2[i]) + i;
                if(temp<min){
                    res.clear();
                    res.add(list2[i]);
                    min=temp;
                }else if(temp==min){
                    res.add(list2[i]);
                }
            }
        }
     /*   String[] strings = new String[res.size()];
        for (int i=0;i<strings.length;i++){
            strings[i]=res.get(i);
        }
        return strings;*/
     return res.toArray(new String[res.size()]);
    }
}
import java.util.HashMap;

public class Solution447 {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res=0;
        for (int i=0;i<points.length;i++){
            map.clear();
            for (int j=0;j<points.length;j++){
                if (i==j){
                    continue;
                }
                int dis=(points[i][0]-points[j][0])*(points[i][0]-points[j][0])+
                        (points[i][1]-points[j][1])*(points[i][1]-points[j][1]);
                res+=map.getOrDefault(dis,0);
                map.put(dis,map.getOrDefault(dis,0)+1);
            }
        }
        return res*2;
    }
}
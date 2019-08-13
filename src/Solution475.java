import java.util.Arrays;

/**
 * 法一：动态规划
 */
/*
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        Arrays.sort(houses);
        int i=0,j=0;
        int dis=0;
        while (i<houses.length){
            //这里必须有=号
            while (j<heaters.length-1&&Math.abs(heaters[j]-houses[i])>=Math.abs(heaters[j+1]-houses[i])){
                j++;
            }
            dis=Math.max(dis,Math.abs(heaters[j]-houses[i]));
            i++;
        }
        return dis;
    }
}*/

/**
 *
 */
public class Solution475 {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        Arrays.sort(houses);
        int res=0;
        int temp=0;
        for (int i=0,j=0;i<heaters.length&&j<houses.length;){
            if(houses[j]<=heaters[i]){
                temp=heaters[i]-houses[j];
                j++;
            }else if(i==heaters.length-1){
                temp=Math.abs(heaters[i]-houses[j]);
                j++;
            }else {
                if(heaters[i+1]<houses[j]){
                    i++;
                }else {
                    temp=Math.min(Math.abs(houses[j]-heaters[i+1]),houses[j]-heaters[i]);
                    j++;
                }
            }
            res=Math.max(res,temp);
        }
        return res;
    }
}
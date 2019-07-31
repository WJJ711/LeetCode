/**
 * 厄拉多塞筛法
 */
public class Solution204 {

    public int countPrimes(int n) {
        boolean[] p = new boolean[n];
        int pnum=0;
        for (int i=2;i<n;i++){
            if(p[i]==false){
                pnum++;
                for (int j=i+i;j<n;j+=i){
                    p[j]=true;
                }
            }
        }
        return pnum;

    }

}
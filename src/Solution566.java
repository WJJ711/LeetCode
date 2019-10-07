public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int l = nums.length;
        int w = nums[0].length;
        if(l*w!=r*c){
            return nums;
        }
        int[][] res = new int[r][c];
        //行
        int k=0;
        //列
        int p=0;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[0].length;j++){
                res[k][p++]=nums[i][j];
                if(p==c){
                    k++;
                    p=0;
                }
            }
        }
        return res;
    }
}
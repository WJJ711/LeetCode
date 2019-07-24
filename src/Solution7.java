public class Solution7 {
    public int reverse(int x) {
        int rev=0;
         while (x!=0){
             int temp=x%10;
             if(rev>Integer.MAX_VALUE/10||rev==Integer.MAX_VALUE/10&&temp>7){
                 return 0;
             }
             if(rev<Integer.MIN_VALUE/10||rev==Integer.MIN_VALUE/10&&temp<-8){
                 return 0;
             }
             rev=rev*10+temp;
             x/=10;
         }
         return rev;
    }
}

/**
 * 使用Long类型
 */
/*

class Solution {
    public int reverse(int x) {
        int flag=x<0?-1:1;
        long abs = flag*(long)x;
        String s = String.valueOf(abs);
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverse = sb.reverse();
        Long integer = Long.valueOf(new String(reverse));
        if(integer>Integer.MAX_VALUE||integer<Integer.MIN_VALUE){
            return 0;
        }
        else{
            return (int) (flag* integer);
        }

    }
}*/

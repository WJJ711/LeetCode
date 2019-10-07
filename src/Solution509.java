import java.util.HashMap;
import java.util.Map;

/**
 * 递归
 */
/*
class Solution {

    private final HashMap<Integer, Integer> map;

    public Solution() {
        map = new HashMap<Integer,Integer>();
        map.put(0,0);
        map.put(1,1);

    }

    public int fib(int N) {
        if(map.containsKey(N)){
            return  map.get(N);
        }
        int temp=fib(N-1)+fib(N-2);
        map.put(N,temp);
        return temp;
    }
}*/

/**
 * 迭代
 */
public class Solution509 {
    public int fib(int N) {
        int cur=0;
        int next=1;
        while (N-->0){
            next=cur+next;
            cur=next-cur;
        }
        return cur;
    }
}
import java.util.HashMap;

//罗马数字转整数
public class Solution13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res=0;
        for(int i=1;i<s.length();i++){
            if(map.get(s.charAt(i))>map.get(s.charAt(i-1))){
                res-=map.get(s.charAt(i-1));
            }else {
                res+=map.get(s.charAt(i-1));
            }
        }
        res+=map.get(s.charAt(s.length()-1));
        return res;
    }
}
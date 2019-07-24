import java.util.ArrayList;
import java.util.LinkedList;

public class Solution20 {
    public boolean isValid(String s) {
        if(s==null||s.length()==0){
            return true;
        }
        LinkedList<Character> list = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if('(' == s.charAt(i)){
                list.add(')');
            } else if('['==s.charAt(i)){
                list.add(']');
            } else if('{'==s.charAt(i)){
                list.add('}');
            } else{
                if(list.size()<=0){
                    return false;
                }
                Character c = list.removeLast();
                if(c!=s.charAt(i)){
                    return false;
                }
            }
        }
        if(list.size()==0){

            return true;
        }else{
            return false;
        }

    }
}
public class Solution551 {
    public boolean checkRecord(String s) {
       int countA=0;
       int countL=0;
       for (char c:s.toCharArray()){
           if(c=='A'){
               countL=0;
               countA++;
               if (countA>1){
                   return false;
               }
           }else if(c=='L'){
               countL++;
               if(countL>2){
                   return false;
               }
           }else {
               countL=0;
           }
       }
       return true;
    }
}
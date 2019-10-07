public class Solution520 {
    public boolean detectCapitalUse(String word) {
        int temp=0;
        for (int i=0;i<word.length();i++){
            if (word.charAt(i)<'a'){
                temp++;
            }
        }
        //大写字母个数是1个，则必须首字母大写
        if (temp==1){
            return word.charAt(0)<'a';
            //大写字母个数大于1个，则全部大写
        }else if (temp>1){
            return word.length()==temp;
        }else {
            //大写字母个数是0个
            return true;
        }

    }
}
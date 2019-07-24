public class Solution443 {
    public int compress(char[] chars) {
        int i=0;//两个指针，i指向未压缩的开头
        int j=0;//j指向压缩后的结尾
        while (i<chars.length&&j<chars.length){
            int temp=i;//记录相同字符序列首元素位置
            chars[j++]=chars[i++];

            while (i<chars.length&&chars[i]==chars[j-1]){
                i++;
            }
            //此时i指向第一个不同的数
            if(i-temp>1){
                char[] chars1 = Integer.toString(i - temp).toCharArray();
                for (char c : chars1) {
                    chars[j++]=c;
                }
            }
        }
        return j;
    }
}

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Solution66 {
    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        int[] ints = new int[digits.length + 1];
        ints[0]=1;
        return ints;
    }
}
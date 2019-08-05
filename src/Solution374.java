/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */
class GuessGame{
    int guess(int num){
        return 1;
    }
}

public class Solution374 extends GuessGame {
    public int guessNumber(int n) {
        int lo=1;
        int hi=n;
        while (lo<=hi){
            int mid=(lo+hi)>>>1;
            if(guess(mid)==0){
                return mid;
            }else if(guess(mid)==-1){
                hi=mid-1;
            }else {
                lo=mid+1;
            }
        }
        return -1;
    }
}
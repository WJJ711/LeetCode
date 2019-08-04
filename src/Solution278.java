class VersionControl{
    boolean isBadVersion(int version){
        return false;
    }
}

public class Solution278 extends VersionControl {
    public int firstBadVersion(int n) {
        int lo=1;
        int hi=n;
        while (lo<=hi){
            int mid=(lo+hi)>>>1;
            if (isBadVersion(mid)==false){
                lo=mid+1;
            }else if(isBadVersion(mid)==true){
                hi=mid-1;
            }

        }
        return lo;
    }
}
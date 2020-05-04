/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1;
        int high=n-1;
        int mid=(low+high)/2;
        int ans=n;
        while(low<=high){
            mid=low + (high-low)/2;
            boolean flag=isBadVersion(mid);
            if(flag){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;        
        }
        return ans;
    }
}   
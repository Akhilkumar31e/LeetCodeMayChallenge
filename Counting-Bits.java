class Solution {
    public int[] countBits(int num) {
        int dp[]=new int[num+1];
        int low=1;
        int high=2;
        /*Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from              previous.
        for the range having same no of bits ,their set bits depend on current no of bits-1
        */
        for(int i=1;i<=num;i++){
            if(i==high){
                low=high;
                high*=2;
            }
            dp[i]=1+dp[i-low];
        }
        return dp;
    }
}
class Solution {
    public int f(int[][] dp,int i,int j,int[] A,int[] B){
        if(i<0||j<0) return 0;
        if(dp[i][j]==Integer.MIN_VALUE){
            int temp=0;
            if(A[i]==B[j]){
                temp=Math.max(temp,f(dp,i-1,j-1,A,B)+1);
            }
            else{
                temp=Math.max(temp,f(dp,i-1,j,A,B));
                temp=Math.max(temp,f(dp,i,j-1,A,B));
            }
            dp[i][j]=temp;
        }
        return dp[i][j];
    }
    public int maxUncrossedLines(int[] A, int[] B) {
        int n=A.length;
        int m=B.length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],Integer.MIN_VALUE);
        int ans=f(dp,n-1,m-1,A,B);
        return ans;
    }
}
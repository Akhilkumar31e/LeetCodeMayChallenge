class Solution {
    public int dis(String a,String b,int i,int j,int[][] dp){
        if(i==a.length()&&j==b.length()) return 0;
        if(i==a.length()) return b.length()-j;
        if(j==b.length()) return a.length()-i;
        if(a.charAt(i)==b.charAt(j)) return dis(a,b,i+1,j+1,dp);
        if(dp[i][j]==-1){
            int temp=Integer.MAX_VALUE;
            temp=Math.min(temp,dis(a,b,i,j+1,dp)+1);
            temp=Math.min(temp,dis(a,b,i+1,j,dp)+1);
            temp=Math.min(temp,dis(a,b,i+1,j+1,dp)+1);
            dp[i][j]=temp;
        }
        return dp[i][j];
    }
    public int minDistance(String word1, String word2) {
        int dp[][]=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++) Arrays.fill(dp[i],-1);
        return dis(word1,word2,0,0,dp);
    }
}
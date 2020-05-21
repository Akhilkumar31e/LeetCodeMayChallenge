class Solution {
    public int countSquares(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0||j==0){
                    if(matrix[i][j]==1)
                                    ans++;
                }
                else{
                    if(matrix[i][j]==1){
                        matrix[i][j]+=Math.min(Math.min(matrix[i-1][j],matrix[i][j-1]),matrix[i-1][j-1]);
                        ans+=matrix[i][j];
                    }
                }
            }
        }
        return ans;
    }
}
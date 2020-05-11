class Solution {
    public void fill(int[][] image,int r,int c,int curr,int newC,int i,int j){
        if(i<0||i>=r||j<0||j>=c) return ;
        if(image[i][j]!=curr) return;
        if(image[i][j]==curr) image[i][j]=newC;
        fill(image,r,c,curr,newC,i+1,j);
        fill(image,r,c,curr,newC,i-1,j);
        fill(image,r,c,curr,newC,i,j+1);
        fill(image,r,c,curr,newC,i,j-1);
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int r=image.length;
        int c=image[0].length;
        int curr=image[sr][sc];
        if(curr==newColor) return image;
         fill(image,r,c,curr,newColor,sr,sc);
        return image;
    }
}
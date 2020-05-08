class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int length=coordinates.length;
        if(length==2) return true;
        int x1=coordinates[0][0];
        int y1=coordinates[0][1];
        int x2=coordinates[1][0];
        int y2=coordinates[1][1];
        int m=0;
        if(x2-x1==0){
            for(int i=0;i<length;i++){
                if(coordinates[i][0]!=x1) return false;
            }
            return true;
        }
        else if(y2-y1==0){
            for(int i=0;i<length;i++){
                if(coordinates[i][1]!=y1) return false;
            }
            return true;
        }
        else{
            m=(y2-y1)/(x2-x1);
            int c=y1-(m*x1);
            for(int i=0;i<length;i++){
                int y=coordinates[i][1];
                int x=coordinates[i][0];
                if(y!=(m*x)+c) return false;
            }
            return true;
        }
    }
}
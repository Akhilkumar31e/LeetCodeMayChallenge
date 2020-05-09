class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1;
        if(num==1) return true;
        for(i=1;i<=num/2;i++){
            if(i*i==num) return true;
        }
        return false;
    }
}
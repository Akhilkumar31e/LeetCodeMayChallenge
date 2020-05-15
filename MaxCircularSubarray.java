class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int ans=Integer.MIN_VALUE;
        int temp=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        //KADANE's on whole array
        for(int i=0;i<A.length;i++){
            temp+=A[i];
            ans=Math.max(ans,temp);
            temp=Math.max(temp,0);
            sum+=A[i];
            max=Math.max(max,A[i]);
        }
        //Negating the array to remove min sum from total sum
        for(int i=0;i<A.length;i++) A[i]=-A[i];
        int ans2=Integer.MIN_VALUE;
        temp=0;
        //KADANE's on negated to array to find max sum of negated array
        for(int i=0;i<A.length;i++){
            temp+=A[i];
            ans2=Math.max(ans2,temp);
            temp=Math.max(temp,0);
        }
        //final Ans is max of two parts
        int finalAns=Math.max(ans,sum+ans2);
        if(finalAns==0) finalAns=max;
        return finalAns;
    }
}
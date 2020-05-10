class Solution {
    public int findJudge(int N, int[][] trust) {
        if(N==1&&trust.length==0) return 1;
        if(trust.length==0) return -1;
        HashSet<Integer> hs=new HashSet<Integer>();
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<trust.length;i++){
            hs.add(trust[i][0]);
            int temp=trust[i][1];
            if(hm.containsKey(temp)){
                hm.put(temp,hm.get(temp)+1);
            }
            else  hm.put(temp,1);
        }
        int ans=-1;
        int count=0;
        for(int i=1;i<=N;i++){
            if(!hs.contains(i)){
                if(hm.containsKey(i)) {
                    if(hm.get(i)==N-1) ans=i;
                    count++;
                }
                
            }
        }
        if(count>1) ans=-1;
        return ans;
    }
}
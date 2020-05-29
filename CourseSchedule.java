class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        if (pre.length==0) return true;
        int ind[]=new int[numCourses];
        ArrayList<ArrayList<Integer>> g=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numCourses;i++){
            g.add(new ArrayList<Integer>());
        }
        for(int i=0;i<pre.length;i++){
            int u=pre[i][0];
            int v=pre[i][1];
            g.get(v).add(u);
            ind[u]++;
        }
        int count=numCourses;
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<numCourses;i++){
            if(ind[i]==0) {
               
                 q.add(i);
            }
            
        }
        while(q.size()!=0){
            int x=q.remove();
            
            for(Integer k:g.get(x)){
                ind[k]--;
                if(ind[k]==0) q.add(k);
            }
            count--;
        }
        return count==0;
        
    }
}
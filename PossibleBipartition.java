class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> g=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=N;i++) g.add(new ArrayList<Integer>());
        for(int i=0;i<dislikes.length;i++){
            int u=dislikes[i][0];
            int v=dislikes[i][1];
            g.get(u).add(v);
            g.get(v).add(u);
        }
        //Coloring edges alternatively so that if a conflict occurs,then is not possible
        //r,b are assumed as red and blue vertices and can also be used as visited vertices
        HashSet<Integer> r=new HashSet<Integer>();
        HashSet<Integer> b=new HashSet<Integer>();
        
        for(int i=1;i<=N;i++){
            //color vertex if it is not visited using dfs so that it returs whether it is possile to color                     // alternatively
            if(!r.contains(i)&&!b.contains(i)){
                if(!dfs(g,b,r,1,i)) return false;
            }
        }
        return true;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> g,HashSet<Integer> b,HashSet<Integer> r,int c,int v){
        if(c==1){
            if(b.contains(v)) return true;
            else if(r.contains(v)) return false;
        }
        else{
            if(b.contains(v)) return false;
            else if(r.contains(v)) return true;
        }
        
        if(c==1) b.add(v);
        else r.add(v);
        
        for(Integer k:g.get(v)){
            if(!dfs(g,b,r,1-c,k)) return false;
        }
        return true;
        
    }
}
class Solution {
    class Pair{
        int x,y;
        double d;
        Pair(int x,int y,double d){
            this.x=x;
            this.y=y;
            this.d=d;
        }
        
    }
    public class PairComparator implements Comparator<Pair>{
        public int compare(Pair p1,Pair p2){
            if(p1.d>p2.d) return 1;
            else if(p1.d<p2.d) return -1;
            else return 0;
        }
    }
    public double dis(int x1,int y1){
        return Math.sqrt((y1*y1)+(x1*x1));
    }
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>(new PairComparator());
        for(int i=0;i<points.length;i++){
            Pair p=new Pair(points[i][0],points[i][1],dis(points[i][0],points[i][1]));
            pq.add(p);
        }
        int ans[][]=new int[K][2];
        while(K-->0){
            Pair p=pq.poll();
            ans[K][0]=p.x;
            ans[K][1]=p.y;
        }
        return ans;
    }
}
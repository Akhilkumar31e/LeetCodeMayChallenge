class Solution {
    class Pair{
        char c;
        int n;
        Pair(char c,int n){
            this.c=c;
            this.n=n;
        }
    }
    /* class PairComparator implements Comparator<Pair>{ 
              
            // Overriding compare()method of Comparator  
            public int compare(Pair s1, Pair s2) { 
                if (s1.n > s2.n) 
                    return 1; 
                else if (s1.n < s2.n) 
                    return -1; 
                                return 0; 
                } 
        } */
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else hm.put(s.charAt(i),1);
        }
        TreeSet<Pair> ts=new TreeSet<Pair>(new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                if(o1.n-o2.n==0)
                {
                   return 1;
                }
                   else  return o1.n-o2.n;   
                }
            });
        for(char k:hm.keySet()){
            Pair p=new Pair(k,hm.get(k));
            ts.add(p);
        }
        StringBuilder ans=new StringBuilder();
        for(Pair p:ts){
            int temp=p.n;
            while(temp-->0){
                ans.append(p.c);
            }
        }
        return ans.reverse().toString();
    }
}
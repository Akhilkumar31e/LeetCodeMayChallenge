class Solution {
    public boolean checkInclusion(String p, String s) {
    
        if(s.length()<p.length()) return false;
        long target=0;
        long temp=0;
        //Computing hash values for strings 
        for(int i=0;i<p.length();i++){
            target=target+(long)Math.pow(p.charAt(i),3);
            temp=temp+(long)Math.pow(s.charAt(i),3);
        }
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(temp==target) ans.add(0);
        int len=p.length();
       //Sliding window for string s
        for(int i=1;i<s.length()-len+1;i++){
            temp=temp-(long)Math.pow(s.charAt(i-1),3);
            temp=temp+(long)Math.pow(s.charAt(i+len-1),3);
            //Compare hash value 
            if(temp==target) ans.add(i);
        }
       if(ans.size()==0) return false;
        else return true;
    }
}
    
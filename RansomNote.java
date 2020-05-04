class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        int rl=ransomNote.length();
        int ml=magazine.length();
        for(int i=0;i<ml;i++){
            if(hm.containsKey(magazine.charAt(i))){
                hm.put(magazine.charAt(i),hm.get(magazine.charAt(i))+1);
            }
            else hm.put(magazine.charAt(i),1);
        }
        int i=0;
        for( i=0;i<rl;i++){
            if(hm.containsKey(ransomNote.charAt(i))){
                int x=hm.get(ransomNote.charAt(i));
                if(x==1) hm.remove(ransomNote.charAt(i));
                else hm.put(ransomNote.charAt(i),x-1);
            }
            else break;
        }
        if(i==rl) return true;
        else return false;
    }
}
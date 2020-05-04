class Solution {
    public int findComplement(int num) {
        //One of the approach
        /*String s=Integer.toBinaryString(num);
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') ans+='0';
            else ans+='1';
            
        }
        int res=Integer.parseInt(ans,2);
        return res;*/
        
        int temp=num;
        int total=0;
        while(temp!=0){
            total=(total<<1)+1;
            temp=temp>>1;
        }
        return total-num;
    }
}
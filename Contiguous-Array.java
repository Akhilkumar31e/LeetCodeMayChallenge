class Solution {
    public int findMaxLength(int[] nums) {
      for(int i=0;i<nums.length;i++){
          if(nums[i]==0) nums[i]=-1;
      }
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<Integer,ArrayList<Integer>>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.get(nums[i]).add(i);
            }
            else {
                ArrayList<Integer> temp=new ArrayList<Integer>();
                temp.add(i);
                hm.put(nums[i],temp);
            }
        }
        int max=0;
        for(Integer i:hm.keySet()){
            
            if(i==0){
                max=Math.max(max,hm.get(i).get(hm.get(i).size()-1)+1);
            }
            else{
                max=Math.max(max,(hm.get(i).get(hm.get(i).size()-1)-hm.get(i).get(0)));
            }
        }
        return max;
    }
}
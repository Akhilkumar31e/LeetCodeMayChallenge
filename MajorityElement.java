class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int ans=0;
        for(Integer i:hm.keySet()){
            if(hm.get(i)>(nums.length/2)){
               
                ans=i;
                break;
            }
        }
        return ans;
    }
}
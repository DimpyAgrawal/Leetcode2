class Solution {
    public int findShortestSubArray(int[] nums) {
        
        int max=0 ;int result=0;
        
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> first_seen=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            first_seen.putIfAbsent(nums[i],i);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
            if(map.get(nums[i])>max){
                max=map.get(nums[i]);
                result=i-first_seen.get(nums[i])+1;
            }
            else if(map.get(nums[i])==max){
                result=Math.min(result,i-first_seen.get(nums[i])+1);
            }
            
        }
        return result;
    }
}
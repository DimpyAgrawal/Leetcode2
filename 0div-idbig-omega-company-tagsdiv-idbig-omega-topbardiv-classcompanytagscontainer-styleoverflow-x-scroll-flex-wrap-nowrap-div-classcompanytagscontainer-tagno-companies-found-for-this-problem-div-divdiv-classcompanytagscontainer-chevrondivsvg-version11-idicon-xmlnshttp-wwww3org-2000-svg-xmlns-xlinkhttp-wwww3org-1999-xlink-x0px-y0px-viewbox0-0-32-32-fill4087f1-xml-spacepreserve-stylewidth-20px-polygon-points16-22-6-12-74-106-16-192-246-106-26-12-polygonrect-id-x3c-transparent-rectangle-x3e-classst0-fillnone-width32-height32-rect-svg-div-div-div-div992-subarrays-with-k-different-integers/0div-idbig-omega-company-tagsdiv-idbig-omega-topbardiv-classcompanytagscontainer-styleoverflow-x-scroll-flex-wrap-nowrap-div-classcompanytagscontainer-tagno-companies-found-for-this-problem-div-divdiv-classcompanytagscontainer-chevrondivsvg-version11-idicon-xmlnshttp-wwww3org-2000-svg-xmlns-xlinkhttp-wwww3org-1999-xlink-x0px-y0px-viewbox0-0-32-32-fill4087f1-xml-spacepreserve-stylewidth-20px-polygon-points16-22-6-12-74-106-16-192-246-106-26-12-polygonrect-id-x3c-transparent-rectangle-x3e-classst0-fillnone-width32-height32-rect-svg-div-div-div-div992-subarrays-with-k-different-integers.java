class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return subarraysWithAtMostKDistinct(nums,k) - subarraysWithAtMostKDistinct(nums,k-1);
    }
    public int subarraysWithAtMostKDistinct(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int ei=0;
        int si=0;
        int ans=0;
        int n=nums.length;
        while(ei<n){
            map.put(nums[ei],map.getOrDefault(nums[ei],0)+1);
            while(map.size()>k){
                map.put(nums[si],map.get(nums[si])-1);
                if(map.get(nums[si])==0) map.remove(nums[si]);
                si++;
            }
            ans+=ei-si+1; //size of subarray
            ei++;

        }
        return ans;
    } 
}
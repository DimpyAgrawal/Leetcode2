class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long minIdx = -1;
        long maxIdx = -1;
        long CI = -1;
        long temp=0;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==minK) minIdx = i;
            if(nums[i]==maxK) maxIdx = i;
            if(nums[i]<minK || nums[i]>maxK) CI = i;
            long smaller  = Math.min(minIdx,maxIdx);
            temp = smaller-CI;
            ans+= temp<=0?0:temp;
        }
        return ans;
      }
}
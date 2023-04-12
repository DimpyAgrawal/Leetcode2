class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int sum=0;
        int start=0;
        int min=Integer.MAX_VALUE;
        for(int e=0;e<nums.length;e++){
            sum+=nums[e];
            while(sum>=k){
                min=Math.min(min,e-start+1);
                sum-=nums[start++];
            }
        }
        return min==  (Integer.MAX_VALUE)? 0:min;
    }
    
}
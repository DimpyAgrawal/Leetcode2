class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp =  new int[nums.length]; 
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]) {
                    int a=dp[j]+1;
                    dp[i] =Math.max(dp[i],a);
                }
            }
        }
        int max=dp[0];
        for(int i=1;i<dp.length;i++){
            if(dp[i]>max) max=dp[i];
        }
        return max;
    }

}
class Solution {
    public int rob(int[] nums) {
      
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return (robUtil(nums,nums.length-1,dp));
        
    }
    public int robUtil(int[] nums,int ind,int[] dp ){
         if(ind==0) return nums[0];
        if(ind<0) return 0;
        
        if(dp[ind]!=-1) return dp[ind];
        
        int pick=nums[ind]+robUtil(nums,ind-2,dp);
        int nonpick=0+robUtil(nums,ind-1,dp);
        
       return dp[ind]= (Math.max(pick, nonpick)); 
    }
    
}
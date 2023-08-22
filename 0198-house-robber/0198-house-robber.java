class Solution {
    public int rob(int[] nums) {
      int n=nums.length;
        int[] dp = new int[nums.length];
        
       // Arrays.fill(dp,-1);
       // return (robUtil(nums,nums.length-1,dp));
        
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            int pick=nums[i];
            if(i>1)  pick+=dp[i-2];
            int nonpick = 0+dp[i-1];
            
            dp[i]=Math.max(pick,nonpick);
        }
        return dp[n-1];
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
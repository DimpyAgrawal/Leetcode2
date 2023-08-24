class Solution {
     int[] dp;
    public int coinChange(int[] coins, int amount) {
       dp = new int[amount+1]; 
        Arrays.fill(dp,-1);
        int ans=coinChangeUtil(coins,amount);
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
    public  int coinChangeUtil(int[] coins,int target){
        if(target==0) return 0;
        if(target<0) return Integer.MAX_VALUE;
        if(dp[target]!=-1) return dp[target];
        
        int mincoin = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int ans= coinChangeUtil(coins,target-coins[i]);
            
            if(ans!=Integer.MAX_VALUE){
                mincoin = Math.min(mincoin,1+ans);
            }
        }
        return dp[target]=mincoin;
        
    }
    
}
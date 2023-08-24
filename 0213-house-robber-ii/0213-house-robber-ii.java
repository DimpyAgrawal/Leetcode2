class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        int[] a=new int[nums.length-1];
        int[] b= new int[nums.length-1];
        
        for(int i=0;i<nums.length-1;i++){
            a[i]=nums[i+1];
            b[i]=nums[i];
        }
        
     int x =  robUtil2(a,a.length-1,dp); 
     int y = robUtil2(b,b.length-1,dp); 
    return Math.max(x,y);
        
    }
    
    public static int robUtil2(int[] arr,int ind,int[] dp){
        
        
      int n = arr.length;
    int prev = arr[0];
    int prev2 =0;
    
    for(int i=1; i<n; i++){
        int pick = arr[i];
        if(i>1)
            pick += prev2;
        int nonPick = 0 + prev;
        
        int cur_i = Math.max(pick, nonPick);
        prev2 = prev;
        prev= cur_i;
        
    }
    return prev;
//         dp[0]=nums[0];
//         int neg=0;
        
        
//         for(int i=1;i<nums.length;i++){
            
//            int  pick=nums[ind];
//                if(i>1) pick+=dp[i-2];
//             int nonpick =0+dp[i-1];
//             dp[i]=Math.max(pick,nonpick);
            
//         }
        
       // return dp[nums.length-1];
        
//         if(ind==0) return nums[ind];
//         if(ind<0) return 0;
//         if(dp[ind]!=-1) return dp[ind];
        
//          int pick = nums[ind] + robUtil2(nums,ind-2,dp);
//          int nonpick = 0+robUtil2(nums,ind-1,dp);
//          return dp[ind] = Math.max(pick,nonpick);
          
    }
    
    
    public static int robUtil(int[] nums,int ind){
            if(ind==0) return nums[0];
        if(ind<0) return 0;
        
            int pick = nums[ind]+robUtil(nums,ind-2);
            int nonpick = 0+robUtil(nums,ind-1);
        
          int max=Math.max(pick,nonpick);
       return max; 
    }
}
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n= nums.length;
        int t=0;
        int[] ans= new int[n];
        
        for(int i=0;i<n;i++){
            if(nums[i]%2==0)
                ans[t++]=nums[i];  
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]%2==1)
                ans[t++]=nums[i];
        }
        return ans;
    }
}
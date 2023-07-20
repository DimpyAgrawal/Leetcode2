class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       
        int ans[] = new int[nums.length];
        
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[t]=nums[i];
                t+=2;
            }
        }
        t=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                ans[t]=nums[i];
                t+=2;
            }
        }
        
        return ans;
    }
}
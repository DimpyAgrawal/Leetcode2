class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=0;
        int max=0;
        for(int i=0;i+1<nums.length;i++){
            if(nums[i+1]>nums[i]){
                c++;
              max=Math.max(max,c);  
            }
            else c=0;
        }
        return max+1;
        
        
        
    }
}
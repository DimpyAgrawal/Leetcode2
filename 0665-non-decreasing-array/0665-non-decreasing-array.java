class Solution {
    public boolean checkPossibility(int[] nums){
       int c=0;
        for(int i=0;i+1<nums.length;i++){
            if(nums[i]>nums[i+1]){
                c++;
                if(c>1) return false;
                
                else if(i>0 && nums[i+1]<nums[i-1]){
                    nums[i+1]=nums[i];
                }
            }
        }
        
        return true;
        
    } 
}
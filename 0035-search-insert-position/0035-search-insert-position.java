class Solution {
    public int searchInsert(int[] nums, int val){
    
        int idx=0;
        for(int i=0;i<nums.length;i++){
            idx=i;
            if(nums[i]==val)
                return i;
            if(nums[i]!=val && nums[i]>val)
                return i;
                
        }   
        return idx+1;
    }
}
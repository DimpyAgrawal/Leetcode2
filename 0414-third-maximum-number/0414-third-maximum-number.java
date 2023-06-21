class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        
          if(n<3) return nums[n-1];
       int c=0;
        for(int i=n-2;i>=0;i--){
            if(nums[i]!=nums[i+1]) c++;
            if(c==2){
                 return nums[i];
            }
        }
        if(c==1) return nums[n-1];
        
        return nums[n-3];
        
    }
}
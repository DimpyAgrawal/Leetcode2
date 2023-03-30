class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        long p=0;
        int c=0;
        for(int i=nums.length-1;i>=0;i--){
            p=p+nums[i];
            if(p>0){
                c++;
            }
        
            
        }
        return c;
        
      
    }
}
        
       
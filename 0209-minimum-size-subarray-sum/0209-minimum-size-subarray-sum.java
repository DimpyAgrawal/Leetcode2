class Solution {
    public int minSubArrayLen(int k, int[] nums) {
      int ei=0;
        int si=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
 while(ei<nums.length){
    sum+=nums[ei];
     if(sum>=k){
        while(sum>=k){
           sum-=nums[si];    
             min=Math.min((ei-si+1),min);
             si++;
          }
        }
          
     ei++;
    }
    if(min==Integer.MAX_VALUE) return 0;
     return min;

    }
    
}
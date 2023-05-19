class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int max= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int totalsum=0;
        int sum=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
           // sum+=nums[i];
            sum=Math.max(sum+nums[i],nums[i]);
            max=Math.max(max,sum);
            sum2=Math.min(sum2+nums[i],nums[i]);

            min=Math.min(min,sum2);
            
        }
       if(max<0) return max;
        
        return Math.max(max,totalsum-min);
    }
}


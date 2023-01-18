class Solution {
    public int maxSubarraySumCircular(int[] nums) {
//         int maxsum= Integer.MIN_VALUE;
//         int sum=nums[0];
//         int[] arr=new int[2*nums.length];
//         int k=0;
//         for(int i=0;i<nums.length;i++){
//             arr[i]=nums[i];
//         }
            
//         for(int i=nums.length;i<arr.length;i++){
//             arr[i]=nums[k];
           
//             k++;
//         }
       
        
//         for(int i=0;i<arr.length;i++){
//          sum+=arr[i];
            
//         maxsum=Math.max(maxsum,sum);
//             if(sum<0){
//                 sum=0;
//             }
                
          
        
            
            
//         }
           
        
//        return maxsum;
        int total = 0, maxSum = nums[0], curMax = 0, minSum = nums[0], curMin = 0;
        for (int a : nums) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + a, a);
            minSum = Math.min(minSum, curMin);
            total += a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}
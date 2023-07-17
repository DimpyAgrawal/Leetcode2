class Solution {
    public int findUnsortedSubarray(int[] nums) {
//         int n=nums.length;
//         int min= Integer.MIN_VALUE;
//         int max= Integer.MAX_VALUE;
//         if(n==1) return 0;
        
        
//         for(int i=0;i<n;i++){
            
//             if(i==0){
//                 if(nums[i]>nums[i+1]){
//                     min=Math.min(min,nums[i]);
//                     max=Math.max(max,nums[i]);
//                 }
//             }
            
//             if(nums[i]>nums[i+1] || nums[i]<nums[i-1]){
//                 min=Math.min(min,nums[i]);
//                 max=Math.max(max,nums[i]);
//             }
            
//             if(i==n-1){
                
//                 if(nums[i]<nums[i-1]){
//                      min=Math.min(min,nums[i]);
//                      max=Math.max(max,nums[i]);
//                 }
//             }
//         }
            
//             if(min == Integer.MAX_VALUE || max ==Integer.MIN_VALUE) return 0;
//             //find the positions of min,max
//             //find the length,find max, find 
        
//             int i,j;
            
//             for(i=0;i<n && nums[i]<=min;i++);
//                 for(j=n-1;j>=0 && nums[j]>=max;j--);
//                     //i,j -> min, max -> length b/w these two indices
//                     return j-i+1;
              
        
            int l=0,r=nums.length-1;
            int nums1[]=nums.clone();
            Arrays.sort(nums);
            while(l<r)
            {
                if(nums[l]==nums1[l])
                    l++;
                else if(nums[r]==nums1[r])
                    r--;
                else
                    break;
            }
            return r-l==0? 0: r-l+1;
    }
}
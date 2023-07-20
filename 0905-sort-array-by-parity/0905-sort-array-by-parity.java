class Solution {
    public int[] sortArrayByParity(int[] nums) {
//         int n= nums.length;
//         int t=0;
//         int[] ans= new int[n];
        
//         for(int i=0;i<n;i++){
//             if(nums[i]%2==0)
//                 ans[t++]=nums[i];  
//         }
        
//         for(int i=0;i<n;i++){
//             if(nums[i]%2==1)
//                 ans[t++]=nums[i];
//         }
//         return ans;
        
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]%2>nums[j]%2){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            if(nums[i]%2==0) i++;
            if(nums[j]%2==1) j--;
        }
        return nums;
    }
}
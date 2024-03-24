class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
        int correct = nums[i]-1;
            if(nums[i]>0 && nums[i]<=n&&nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else i++;
        }
       return nums[n-1];

        
    }
}
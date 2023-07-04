class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int min= nums[0];
        int count=0;
        int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        // }
        // return (sum-(n*min));
        
        for(int i=0;i<n;i++){
            count+=(nums[i]-min);
        }
        return count;
    }
}
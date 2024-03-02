class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int c = nums[i]*nums[i];
            nums[i]=c;
        }
        Arrays.sort(nums);
        return nums;
    }
}
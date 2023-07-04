class Solution {
    public int minMoves2(int[] nums) {
Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        int count=0;
        while(l<r){
            count+=Math.abs(nums[r]-nums[l]);
            l++;
            r--;
        }
        return count;
    }
}
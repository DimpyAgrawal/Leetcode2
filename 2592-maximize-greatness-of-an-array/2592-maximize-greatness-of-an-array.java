class Solution {
    public int maximizeGreatness(int[] nums) {
       Arrays.sort(nums);
        int i=0;
        int j=0;
        int count=0;
        while(i<nums.length && j<nums.length){
            if(nums[i]>nums[j]){
                i++;
                j++;
                count++;
            }
            else if(nums[i]<=nums[j]) i++;
        }
        return count;
    }
}